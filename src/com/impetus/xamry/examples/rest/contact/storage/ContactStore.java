package com.impetus.xamry.examples.rest.contact.storage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.impetus.xamry.examples.rest.contact.bean.Address;
import com.impetus.xamry.examples.rest.contact.bean.Contact;



public class ContactStore {
	private static Map<String,Contact> store;
	private static ContactStore instance = null;
	
	private ContactStore() {
		store = new HashMap<String,Contact>();
		initOneContact();
	}
	
	public static Map<String,Contact> getStore() {
		if(instance == null) {
			instance = new ContactStore();
		}
		return store;
	}
	
	private static void initOneContact() {
		Address[] addrs = {
			new Address("Noida", "Sector-63"),
			new Address("Gurgaon", "Sector-56")
		};
		Contact contact1 = new Contact("contact1", "Amresh", Arrays.asList(addrs));
		store.put(contact1.getId(), contact1);
	}
}
