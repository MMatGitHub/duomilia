package com.rhcloud.duomilia.bossas.Simple;


import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;



@ManagedBean
	@SessionScoped
	public class HelloBean implements Serializable {

		private static final long serialVersionUID = 1L;
		
		private String name;

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}

