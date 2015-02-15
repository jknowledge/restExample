package de.jknowledge.rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SystemDto {
	
	private String javaVersion;
	
	private String os;
	
	
	public SystemDto() {
		super();
	}

	public SystemDto(String javaVersion, String os) {
		super();
		this.javaVersion = javaVersion;
		this.os = os;
	}

	public String getJavaVersion() {
		return javaVersion;
	}

	public void setJavaVersion(String javaVersion) {
		this.javaVersion = javaVersion;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	@Override
	public String toString() {
		return "SystemDto [javaVersion=" + javaVersion + ", os=" + os + "]";
	}
	
	
	
}
