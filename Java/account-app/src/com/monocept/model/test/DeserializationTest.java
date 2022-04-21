package com.monocept.model.test;

import com.monocept.model.Account;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationTest {
	public static void main(String args[]) {
		Account accounts[];
		try
        {   
            FileInputStream file = new FileInputStream("data\\file.bin");
            ObjectInputStream in = new ObjectInputStream(file);
              
            accounts = (Account[])in.readObject();
              
            in.close();
            file.close();
              
            System.out.println("Object has been deserialized ");
            for(Account obj: accounts) {
            	printDetails(obj);
            }
            
        }
        catch(Exception ex)
        {
            System.out.println("Exception is caught");
        }
	}
	
	public static void printDetails(Account account) {
		System.out.println("Account No:\t " + account.getAccountNo());
		System.out.println("Name:\t\t " + account.getName());
		System.out.println("Balance:\t " + account.getBalance());
	}
}
