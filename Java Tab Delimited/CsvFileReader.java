import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/*Generic csv file reader
Input: File name
Output:ArrayList with each index represent a row from the given file.*/

public class CsvFileReader{

    public List read(String fileName) throws FileNotFoundException{
        List rowDataList = new ArrayList();
        Scanner scanner = new Scanner(new File(fileName));
        while(scanner.hasNext()){
            rowDataList.add(scanner.nextLine());
        }
	scanner.close();
	return rowDataList;
    }

}
