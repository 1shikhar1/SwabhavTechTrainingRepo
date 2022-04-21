package com.monocept.model.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.monocept.model.Account;

public class AccountDepositeTest {
	public static void main(String args[]) {

		Account accounts[] = new Account[] {new Account(1, "Asha", 5000), new Account(2, "Rohan", 8000), new Account(3, "Vinay", 12000)};
		
		
		String filename = "data\\file.bin";
		
		try
        {   
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
              
            out.writeObject(accounts);
              
            out.close();
            file.close();
              
            System.out.println("Object has been serialized");
  
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
