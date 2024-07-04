package Streams;

import java.util.Optional;

public class UserHandled {
    private Optional<Address> address= Optional.empty();
    private Optional<Address> adrNotInitialized;

    public Optional<Address> getAddress() {
        return address;
    }


    public void setAddress(Optional<Address> address) {
        this.address = address;
    }

    public Optional<Address> getAddressNotInitialised() {
        return Optional.ofNullable(adrNotInitialized).orElse(Optional.empty());
    }
}
