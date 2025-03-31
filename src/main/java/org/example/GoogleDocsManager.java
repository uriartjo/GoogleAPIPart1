package org.example;

public class GoogleDocsManager {

    /**
     * Inserts text at the beginning of a specified Google Doc.
     * Detects and applies formatting for bold <b>text</b> and italic <i>text</i>.
     *
     * @param service The Google Docs service instance
     * @param docId The ID of the Google Doc
     * @param text The text to insert, may contain HTML tags for formatting
     * @throws IOException If an error occurs during the API call
     */
    public static void insertText(Docs service, String docId, String text) throws IOException {
        // TODO: Implement this method
    }

    /**
     * Creates a new Google Doc with the specified name and inserts text at the beginning.
     * Detects and applies formatting for bold <b>text</b> and italic <i>text</i>.
     *
     * @param service The Google Docs service instance
     * @param docName The name for the new Google Doc
     * @param text The text to insert, may contain HTML tags for formatting
     * @return The ID of the newly created document
     * @throws IOException If an error occurs during the API call
     */
    public static String insertText(Docs service, String docName, String text) throws IOException {
        // TODO: Implement this method
    }

    /**
     * Extracts the text content from a Google Doc.
     * Does not include formatting information.
     *
     * @param service The Google Docs service instance
     * @param docId The ID of the Google Doc
     * @return The text content of the document as a String
     * @throws IOException If an error occurs during the API call
     */
    public static String getText(Docs service, String docId) throws IOException {
        // TODO: Implement this method
    }
}
