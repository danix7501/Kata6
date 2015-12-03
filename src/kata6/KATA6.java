package kata6;

import java.io.IOException;
import java.util.ArrayList;

public class KATA6 {

    public static void main(String[] args) throws IOException {

        String nameFile = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Kata4-master\\DATA\\emailsfilev1.txt";
        ArrayList<String> mailArray = MailListReader.read(nameFile);
        System.out.println(mailArray.size());

        Histogram<String> histogram = MailHistogramBuilder.build(mailArray);

        new HistogramDisplay(histogram).execute();
        
    }

}
