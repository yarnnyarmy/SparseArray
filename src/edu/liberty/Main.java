package edu.liberty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sn = new Scanner(System.in);
        List<String> string = new ArrayList<String>();
        List<String> queries = new ArrayList<String>();
        List<Integer> result = new ArrayList<Integer>();
        System.out.println("Enter the length of items in the string list");
        int n = sn.nextInt();
        System.out.println("Enter the length in the queries list");
        int q = sn.nextInt();

        // for loop to add the user input to the string list
        System.out.println("Enter the items in the string list");
        for (int i = 0; i < n; i++){
            string.add(sn.next());
        }

        // for loop to add user input to the queries list
        System.out.println("Enter the items in the queries list");
        for (int i = 0; i < q; i++){
            queries.add(sn.next());
        }

        // nest for loop if the element in the queries list equals the element in the string list then add 1
        // to the counter. When the counter add the item to the result list the counter will reset.
        for(int i = 0; i <queries.size(); i++){
            int count = 0;
            for (int j = 0; j < string.size(); j++){
                if (queries.get(i).equals(string.get(j))){
                    count++;
                }
            }
            result.add(count);
        }
        System.out.println(result);
    }
}
