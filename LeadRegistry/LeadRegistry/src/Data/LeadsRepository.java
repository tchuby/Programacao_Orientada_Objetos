package Data;

import java.util.ArrayList;

import Model.Lead;

public class LeadsRepository {
	
	private static ArrayList<Lead> base = new ArrayList<>();
	
	public void addLead(Lead lead) {
		base.add(lead);
	}
	
	public ArrayList<Lead> getAllLeads() {
		return base;
	}
	
	public ArrayList<Lead> getLeadsByProduct(String product){
		
		ArrayList<Lead> leads = new ArrayList<>();
		
		for(Lead lead : base) {
			if(lead.getProduct().equals(product)) {
				leads.add(lead);
			}
		}
		
		return leads;
	}
	
	public Lead getLeadByName(String leadName) {
		
		for(Lead lead: base) {
			if(lead.getName().equals(leadName)) {
				return lead;
			}
		}
		
		return null;
	}
}
