package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

/**
 * Abstract class Storage
 *
 */
public abstract class Storage {
    /**
     * Signals that some error has occured while trying to convert and read/write data between the application
     * and the storage file.
     */
    public static class StorageOperationException extends Exception {
        public StorageOperationException(String message) {
            super(message);
        }
    }
    
    /**
     * Saves all data to this data source.
     *
     * @throws StorageOperationException if there were errors converting and/or storing data.
     */
    public abstract void save(AddressBook addressBook) throws StorageOperationException;
    
    /**
     * Loads data from this data source.
     *
     * @throws StorageOperationException if there were errors reading and/or converting data.
     */
    public abstract AddressBook load() throws StorageOperationException;
    
    /**
     * Get data source of the current storage mechanism
     * 
     * @return String Description of the current data source
     */
    public abstract String getDataSource();
}
