package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

/**
 * Represents the dummy storage instance in testing
 * Logic injects a StorageStub object to replace the dependency of Logic on Storage before testing Logic.
 */
public class StorageStub extends Storage {

    public StorageStub() {
        
    }
    
    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
        // do nothing
        
    }

    @Override
    public AddressBook load() throws StorageOperationException {
        // do nothing
        return null;
    }

    @Override
    public String getDataSource() {
        // do nothing
        return "Dummy Storage";
    }

}
