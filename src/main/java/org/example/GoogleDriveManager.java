package org.example;

import java.util.List;

public class GoogleDriveManager {

    /**
     * Lists the first 100 folders in the user's Google Drive.
     * Only includes items that are folders (not files or other items).
     *
     * @param service The Google Drive service instance
     * @return A string containing the names and IDs of the folders
     * @throws IOException If an error occurs during the API call
     */
    public static String outputDirectoryFolders(Drive service) throws IOException {
        // TODO: Implement this method
    }

    /**
     * Finds files in Google Drive that contain a specific search term in their name.
     *
     * @param service The Google Drive service instance
     * @param searchTerm The term to search for in file names
     * @return An ArrayList of String IDs for the matching files
     * @throws IOException If an error occurs during the API call
     */
    public static ArrayList<String> findFile(Drive service, String searchTerm) throws IOException {
        // TODO: Implement this method
    }

    public static ArrayList<String> findFolder(Drive service, String searchTerm) throws IOException {
        // TODO: Implement this method
    }

    public static List<String> moveFileToFolder(Drive service, String fileId, String folderId){

    }


}
