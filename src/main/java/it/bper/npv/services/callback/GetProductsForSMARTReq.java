/**
 * 
 */
package it.bper.npv.services.callback;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author root
 * 
 */
//@XmlRootElement(name="getProductsForSMARTRequest" )
//@XmlAccessorType(XmlAccessType.FIELD)
public class GetProductsForSMARTReq  {

	/**
	 * 
	 */
	//@XmlTransient
	private static final long serialVersionUID = 1L;
	
	//@XmlAttribute(name = "scope", namespace ="")
	private String scope = null;
	
	//@XmlAttribute(name = "management", namespace ="")
	private String management = null;
	
	//@XmlAttribute(name = "ndgCode", namespace ="")
	private String ndgCode = null;
	
	//@XmlAttribute(name = "ndgType", namespace ="")
	private String ndgType = null;
	
	//@XmlAttribute(name = "bankCode", namespace ="")
	private String bankCode = null;
	
	//@XmlAttribute(name = "ndgDesc", namespace ="")
	private String ndgDesc = null;
	


	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getManagement() {
		return management;
	}

	public void setManagement(String management) {
		this.management = management;
	}

	public String getNdgCode() {
		return ndgCode;
	}

	public void setNdgCode(String ndgCode) {
		this.ndgCode = ndgCode;
	}

	public String getNdgType() {
		return ndgType;
	}

	public void setNdgType(String ndgType) {
		this.ndgType = ndgType;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getNdgDesc() {
		return ndgDesc;
	}

	public void setNdgDesc(String ndgDesc) {
		this.ndgDesc = ndgDesc;
	}
	
	
	

}
