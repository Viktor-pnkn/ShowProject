package program;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FirstProgram {

    static void readFromFile(String fileName) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
    }

    public static void main(String[] args) throws ParseException {
        /*Date d = new Date();
        SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy");
        Date parse = f.parse("12.09.2009");
        System.out.println(parse);*/

        /*try {
            readFromFile("file.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int y = 10;
        Integer g = 3;

        int[] mass = new int[5];
        Scanner s = new Scanner(System.in);
        ArraysUtil.fill(mass, s);
        System.out.println(Arrays.binarySearch(mass, 5));
        //System.out.println(Arrays.binarySearch(mass, 5));
        System.out.println(Arrays.toString(mass));
        int[] mass1 = Arrays.copyOfRange(mass, 2, 8);
        System.out.println(Arrays.toString(mass1));
        Arrays.fill(mass, 4);*/


        /*//ArrayList<Integer> mabel = new ArrayList<>(Arrays.asList(mass));
        //System.out.println(mabel);
        System.out.println("hello");
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();
        System.out.println("our number is " + d);


        int[] mass = new int[]{1, 2, 3, 4, 5};
        int[] mass1 = new int[9];
        System.out.println(Arrays.toString(mass1));
        System.out.println(Arrays.toString(mass));
        System.out.println(Arrays.equals(mass, new int[]{4, 5, 6}));
        Arrays.fill(mass, 0, 2, 5);
        System.out.println(Arrays.toString(mass));
        Arrays.sort(mass);
        System.out.println(Arrays.toString(mass));
        int[] ints = Arrays.copyOf(mass, 2);
        System.out.println(Arrays.toString(ints));


        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(1, 555);
        boolean contains = list.contains(10);
        System.out.println(contains);
        Integer integer = list.get(1);
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }*/


       /* int[] mass = new int[]{1, 2, 3, 4, 6, 7, 1999};
        int[] mass1 = Arrays.copyOf(mass, mass.length - 1);
        Arrays.fill(mass1, 2, 4, 0);
        // System.out.println(Arrays.toString(mass1));
        // System.out.println(Arrays.equals(mass1, new int[]{1, 2, 0, 0, 6, 7}));
        int[] mass2 = Arrays.copyOf(mass1, mass1.length + 7);
        //System.out.println(Arrays.toString(mass2));
        List<int[]> ints = Arrays.asList(mass, new int[]{1,2});
        for (int i = 0; i < ints.size(); i++) {
           // System.out.println(Arrays.toString(ints.get(i)));
        }
        Integer[] m = new Integer[3];
        ArraysUtil.fillRandomI(m);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(m));
        Integer[] mm = list.toArray(new Integer[list.size()-1]);
        System.out.println(Arrays.toString(mm));
        list.add(21);
        //System.out.println(ints.getClass());
        //ints.add(mass);
        ////ints.add(1, new int[]{122});
        //System.out.println(list);*/
    }
}

