package com.shubhi.bre_lookup_testing;
import java.util.*;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Data_object implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private long ppmonth;
	private long ppweek;
	private long transaction_id;
	private java.util.List<java.lang.String> lkp_list=new ArrayList<java.lang.String>();
	private long npd_attr_1;
	private long npd_attr_2;

	public Data_object() {
	}

	public long getPpmonth() {
		return this.ppmonth;
	}

	public void setPpmonth(long ppmonth) {
		this.ppmonth = ppmonth;
	}

	public long getPpweek() {
		return this.ppweek;
	}

	public void setPpweek(long ppweek) {
		this.ppweek = ppweek;
	}

	public long getTransaction_id() {
		return this.transaction_id;
	}

	public void setTransaction_id(long transaction_id) {
		this.transaction_id = transaction_id;
	}

	public java.util.List<java.lang.String> getLkp_list() {
		return this.lkp_list;
	}

	public void setLkp_list(java.util.List<java.lang.String> lkp_list) {
		this.lkp_list = lkp_list;
	}

	public long getNpd_attr_1() {
		return this.npd_attr_1;
	}

	public void setNpd_attr_1(long npd_attr_1) {
		this.npd_attr_1 = npd_attr_1;
	}

	public long getNpd_attr_2() {
		return this.npd_attr_2;
	}

	public void setNpd_attr_2(long npd_attr_2) {
		this.npd_attr_2 = npd_attr_2;
	}
    
    public long breLookup( int index,java.lang.String lookup_name,long... lkp_args)
    {
        
        /*String lkp_str = lookup_name;
        int j =0;
        for (long i : lkp_args) {
			lkp_str = j==0?lkp_str + "-" + Long.toString(i):lkp_str + "," +  Long.toString(i);
			j++;
		}
        int i = this.lkp_list.indexOf("transaction-100000");
        
       String[] str_list = this.lkp_list.get(i).split("-");
       
       String[] output_list = str_list[2].split(",");
       
       return Long.parseLong(output_list[index]);*/
       return 1;
    }
}