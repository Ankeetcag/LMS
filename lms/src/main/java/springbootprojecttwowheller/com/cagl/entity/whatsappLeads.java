package springbootprojecttwowheller.com.cagl.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class whatsappLeads {

	@Id
	private long sno;
	private String branchId;
	private String branchName;
	private String customerId;
	private String customerName;
	private String productType;
	private long loanAmount;
	private LocalDate upload_date;
	
	public long getSno() {
		return sno;
	}
	public whatsappLeads() {
		super();
		// TODO Auto-generated constructor stub
	}
	public whatsappLeads(long sno, String branchId, String branchName, String customerId, String customerName,
			String productType, long loanAmount, LocalDate upload_date) {
		super();
		this.sno = sno;
		this.branchId = branchId;
		this.branchName = branchName;
		this.customerId = customerId;
		this.customerName = customerName;
		this.productType = productType;
		this.loanAmount = loanAmount;
		this.upload_date = upload_date;
	}
	public void setSno(long sno) {
		this.sno = sno;
	}
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public LocalDate getUpload_date() {
		return upload_date;
	}
	public void setUpload_date(LocalDate upload_date) {
		this.upload_date = upload_date;
	}
	@Override
	public String toString() {
		return "whatsappLeads [sno=" + sno + ", branchId=" + branchId + ", branchName=" + branchName + ", customerId="
				+ customerId + ", customerName=" + customerName + ", productType=" + productType + ", loanAmount="
				+ loanAmount + ", upload_date=" + upload_date + "]";
	}
	
	
}