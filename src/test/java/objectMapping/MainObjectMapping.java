package objectMapping;

import objectMapping.builder.UserBuilder;
import objectMapping.objects.Address;
import objectMapping.objects.Company;
import objectMapping.objects.User;

public class MainObjectMapping {

    public static void main(String[] args) {

        Address userAddress = new Address();
        userAddress.setCity("Minsk");
        userAddress.setZipcode("220005");

        Address companyAddress = new Address();
        companyAddress.setCity("Minsk");
        companyAddress.setZipcode("220013");

        Company company = new Company();
        company.setName("IT Tech");
        company.setAddress(companyAddress);

        User user = new User();
        user.setId(1);
        user.setName("Ivan");
        user.setEmail("ivan.ivanov@gmail.com");
        user.setAddress(userAddress);
        user.setCompany(company);
        System.out.println(user.getCompany().getName());

        User user1 = new UserBuilder().withRequiredFieldsOnly().build();
        System.out.println(user1.getName());

        User user2 = new UserBuilder().withAllFields().build();
        System.out.println(user2.getName());


    }

}
