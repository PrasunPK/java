package validator;

import com.guest.Guest;
import com.guest.Guests;
import com.parser.OptionHandler;
import com.person.*;
import com.person.name.Name;
import lib.Pair;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class ValidatorTest {
    Guests guests;
    Guest g1;
    Guest g2;
    Guest g3;
    Guest g4;

    @Before
    public void setUp() throws Exception {
        guests = new Guests();
        g1 = new Guest(new Name("Julius", "Barrows"), Gender.FEMALE, 18, new Address(new City("Veda haven"), new State("Vermont"), new Country("Macedonia")));
        g2 = new Guest(new Name("Brandt", "Huel"), Gender.MALE, 25, new Address(new City("West Shanna"), new State("Illinois"), new Country("Macedonia")));
        g3 = new Guest(new Name("Velma", "Bergstrom"), Gender.MALE, 24, new Address(new City("Katlynn view"), new State("Vermont"), new Country("Macedonia")));
        g4 = new Guest(new Name("Melody", "Dooley"), Gender.FEMALE, 31, new Address(new City("West Shanna"), new State("Vermont"), new Country("Bangladesh")));
        guests.add(g1);
        guests.add(g2);
        guests.add(g3);
        guests.add(g4);
    }

    @Test
    public void test_validates_guests_with_name_format_only() throws Exception {
        String[] options = {"--format", "-c", "--file", "a.txt"};
        OptionHandler optionHandler = new OptionHandler(options);
        List<Pair<String, String>> filters = optionHandler.extract();
        Validator validator = new Validator(filters);
        Guest[] validatedGuests = validator.validate(guests);
        Guest[] expectedGuests = {
                g1, g2, g3, g4
        };


        assertArrayEquals(expectedGuests, validatedGuests);
    }

    @Test
    public void test_validates_guests_with_name_format_and_country_name() throws Exception {
        String[] options = {"--format", "-c", "--country", "Macedonia", "--file", "a.txt"};
        OptionHandler optionHandler = new OptionHandler(options);
        List<Pair<String, String>> filters = optionHandler.extract();
        Validator validator = new Validator(filters);
        Guest[] validatedGuests = validator.validate(guests);
        Guest[] expectedGuests = {
                g1, g2, g3
        };


        assertArrayEquals(expectedGuests, validatedGuests);
    }

    @Test
    public void test_validates_guests_with_name_format_and_age() throws Exception {
        String[] options = {"--format", "-c", "--age", "23", "--file", "a.txt"};
        OptionHandler optionHandler = new OptionHandler(options);
        List<Pair<String, String>> filters = optionHandler.extract();
        Validator validator = new Validator(filters);
        Guest[] validatedGuests = validator.validate(guests);
        Guest[] expectedGuests = {
                g2, g3, g4
        };

        assertArrayEquals(expectedGuests, validatedGuests);
    }

    @Test
    public void test_validates_guests_with_name_format_country_name_and_age() throws Exception {
        String[] options = {"--format", "-c", "--country", "Macedonia", "--age", "23", "--file", "a.txt"};
        OptionHandler optionHandler = new OptionHandler(options);
        List<Pair<String, String>> filters = optionHandler.extract();
        Validator validator = new Validator(filters);
        Guest[] validatedGuests = validator.validate(guests);
        Guest[] expectedGuests = {
                g2, g3
        };

        assertArrayEquals(expectedGuests, validatedGuests);
    }


}