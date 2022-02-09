import com.BntaAaronNazareth.Exercises.E12_Using_Data_Structures.Exercise1_Number_of_Occurrences;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfOccurrencesTest {
    @Test
    void numberOfOccurrencesForStringOfInputs() {
        // Given
        String input = "1,1,1,2,3,3";
        // When
        Exercise1_Number_of_Occurrences number_of_occurrences = new Exercise1_Number_of_Occurrences();
        Map<String, Integer> actual = number_of_occurrences.numberOfOccurrences(input);
        // Then
        Map<String, Integer> expected = Map.of(
                "1", 3,
                "2", 1,
                "3", 2
        );
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void numberOfOccurrencesForEmptyString() {
        // Given
        String input = "";
        // When
        Exercise1_Number_of_Occurrences number_of_occurrences = new Exercise1_Number_of_Occurrences();
        Map<String, Integer> actual = number_of_occurrences.numberOfOccurrences(input);
        // Then
        Map<String, Integer> expected = Map.of();
        assertThat(actual).isEqualTo(expected);
    }
}
