package org.guangchi.entity;

public class Login {
		private  static String name;
		private  static String pwd;
		public static String getName() {
			return name;
		}
		public static void setName(String name) {
			Login.name = name;
		}
		public static String getPwd() {
			return pwd;
		}
		public static void setPwd(String pwd) {
			Login.pwd = pwd;
		}
}
