package DominionCardsHTMLReader;

import DominionCard.DominionCard;
import DominionCard.DominionExpansions.DominionExpansion;
import DominionCards.DominionCards;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.swing.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by Muraki on 7/16/2017.
 */
public class DominionCardsHTMLReader extends DominionCards {

    public String getInnerHTML(String htmlString) throws Exception {
        while (htmlString.indexOf("<") == 0) htmlString = htmlString.substring(htmlString.indexOf(">") + 1);

        while (htmlString.lastIndexOf(">") == htmlString.length() - 1)
            htmlString = htmlString.substring(0, htmlString.lastIndexOf("<"));

        htmlString = htmlString.replace("\n", "").replace("<br />", "\n");

        return htmlString;
    }

    private String readNextHTMLCardElement(BufferedReader reader) throws Exception {
        String htmlElement = "";
        while (!htmlElement.contains("</td>")) {
            htmlElement += reader.readLine();
        }
        return htmlElement;
    }

    private DominionCard readHTMLCardBlock(BufferedReader reader) throws Exception {
        DominionCard newCard = new DominionCard();

        newCard.setName(getInnerHTML(readNextHTMLCardElement(reader)));
        newCard.setTypes(getInnerHTML(readNextHTMLCardElement(reader)));
        newCard.setCost(getInnerHTML(readNextHTMLCardElement(reader)));
        newCard.setDescription(getInnerHTML(readNextHTMLCardElement(reader)));
        reader.readLine();

        return newCard;
    }

    private void readToFirstCard(BufferedReader reader) throws Exception {
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains("<tbody>")) {
                return;
            }
        }
    }

    private void loadExpansionFromWeb(String urlExpansionPart, DominionExpansion expansion) {
        try {
            URL url = new URL("https://dominionstrategy.com/card-lists/" + urlExpansionPart + "-card-list/");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            readToFirstCard(reader);
            while ((line = reader.readLine()) != null) {
                if (line.contains("</tbody>")) break;
                add(readHTMLCardBlock(reader));
            }
            reader.close();
        } catch (Exception e) {
        }

    }

    public void loadFromWeb() {
        loadExpansionFromWeb(DominionExpansion.DOMINION.toString(), DominionExpansion.DOMINION);
        loadExpansionFromWeb(DominionExpansion.INTRIGUE.toString(), DominionExpansion.INTRIGUE);
        loadExpansionFromWeb(DominionExpansion.SEASIDE.toString(), DominionExpansion.SEASIDE);
        loadExpansionFromWeb(DominionExpansion.ALCHEMY.toString(), DominionExpansion.ALCHEMY);
        loadExpansionFromWeb(DominionExpansion.PROSPERITY.toString(), DominionExpansion.PROSPERITY);
        loadExpansionFromWeb(DominionExpansion.CORNUCOPIA.toString(), DominionExpansion.CORNUCOPIA);
        loadExpansionFromWeb(DominionExpansion.HINTERLANDS.toString(), DominionExpansion.HINTERLANDS);
        loadExpansionFromWeb(DominionExpansion.DARK_AGES.toString(), DominionExpansion.DARK_AGES);
        loadExpansionFromWeb(DominionExpansion.GUILDS.toString(), DominionExpansion.GUILDS);
    }

    private void AddCardElement(Element rootElement, DominionCard dominionCard) {
        Document document = rootElement.getOwnerDocument();

        String cardElementName = "DominionCard";
        Element cardElement = document.createElement(cardElementName);


        Attr nameAttribute = document.createAttribute("name");
        nameAttribute.setValue(dominionCard.getName());
        cardElement.appendChild(nameAttribute);

        rootElement.appendChild(cardElement);
    }

    public void saveToXML(String xmlFile) {
        try {
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

            String rootName = "DominionCards";
            Element rootElement = document.createElement(rootName);
            document.appendChild(rootElement);
            for(int i = 0; i < size(); i++){
                AddCardElement(rootElement, get(i));
            }

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            Result output = new StreamResult(new File(xmlFile));
            Source input = new DOMSource(document);

            transformer.transform(input, output);


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error:", JOptionPane.ERROR_MESSAGE);
        }
    }

}
