package com.cts.demos.model;

import org.springframework.stereotype.Component;

/* Target object

The object being advised by one or more aspects. 
This object will always be a proxied object, 
also referred to as the advised object.      */

@Component
public class Employee {
        private String id;
        private String name;
        private String desig;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDesig() {
			return desig;
		}
		public void setDesig(String desig) {
			this.desig = desig;
		}
        
	   
}
