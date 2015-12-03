package kata6;

import java.io.IOException;
import java.util.ArrayList;

public class KATA6 {

    public static void main(String[] args) throws IOException {

        String nameFile = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Kata4-master\\DATA\\emailsfilev1.txt";
        ArrayList<Person> mailArray = MailListReader.read(nameFile);
        System.out.println(mailArray.size());

        HistogramaBuilder<Person> builder = new HistogramaBuilder<>(mailArray);
        Histogram<String> domains = builder.build(new Attribute<Person, String>() {

            @Override
            public String get(Person item) {
                return item.getMail().split("@")[1];
            }
        });
        
        Histogram<Character> letters = builder.build(new Attribute<Person, Character>() {

            @Override
            public Character get(Person item) {
                return item.getMail().charAt(0);
            }
        });
        
        //Histogram<String> histogram = MailHistogramBuilder.build(mailArray);
        //new HistogramDisplay(histogram).execute();
        new HistogramDisplay(domains,"DOMINIOS").execute();
        new HistogramDisplay(letters,"CARACTER").execute();
        
    }

}
