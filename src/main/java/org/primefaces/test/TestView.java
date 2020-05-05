package org.primefaces.test;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestView implements Serializable {

	private String testString;
	private Date date;
	private LocalDateTime maxDate;

	@PostConstruct
	public void init() {
		testString = "Welcome to PrimeFaces!!!";
		maxDate = LocalDateTime.now();
	}

	public String getTestString() {
		return testString;
	}

	public void setTestString(String testString) {
		this.testString = testString;
	}

	public LocalDateTime getMaxDate() {
		return maxDate;
	}

	public void setMaxDate(LocalDateTime maxDate) {
		this.maxDate = maxDate;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
