package examples.users;

import com.intuit.karate.junit5.Karate;

class UsersRunner {
    
    @Karate.Test
    Karate testUsers() {
        return new Karate().feature("users").relativeTo(getClass());
    }

    @Karate.Test
    Karate testZipCode() {
        return new Karate().feature("ZipCode").relativeTo(getClass());
    }

}
