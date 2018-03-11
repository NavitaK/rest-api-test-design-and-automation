package objectMapping.builder;

import objectMapping.objects.User;

import java.util.Random;

public class UserBuilder {

    User user = new User();

    public UserBuilder withRequiredFieldsOnly() {
        user.setId(generateRandomId());
        user.setName("Ivan");
        user.setEmail("ivan.ivanov@gmail.com");
        return this;
    }

    public UserBuilder withAllFields() {
        withRequiredFieldsOnly();
        // add the rest of the fields. Use builders for Address and Company to define corresponding fields
        // ...
        return this;
    }

    // builder methods that add one field at a time.
    // ...

    public User build() {
        return user;
    }

    public int generateRandomId() {
        int min = 1;
        int max = 1000000;
        return new Random().nextInt((max - min) + 1) + min;
    }

}
