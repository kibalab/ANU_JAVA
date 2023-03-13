import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Console {
    public static String ReadLine() {
        try {
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(input);

            return buffer.readLine();
        } catch (Exception e) {
            System.out.println("Cannot read console input!");
            return "";
        }
    }

    public static int[] ReadIntegersInLIne()
    {
        String[] rawParameters = ReadLine().split(" ");
        int[] parameters = new int[rawParameters.length];

        for(int i = 0; i< rawParameters.length; i++)
        {
            parameters[i] = Integer.parseInt(rawParameters[i]);
        }

        return parameters;
    }
}
