package application;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Data implements Serializable {
	private String URLLabel1, URLLabel2, URLLabel3, URLLabel4, URLLabel5, URLLabel6, URLLabel7, URLLabel8, URLLabel9,
			URLLabel10;
	private String ClassLabel1, ClassLabel2, ClassLabel3, ClassLabel4, ClassLabel5, ClassLabel6, ClassLabel7,
			ClassLabel8, ClassLabel9, ClassLabel10;

	private String TextField1, TextField2, TextField3, TextField4, TextField5, TextField6, TextField7, TextField8,
			TextField9, TextField10;
	private String TextField11, TextField12, TextField13, TextField14, TextField15, TextField16, TextField17,
			TextField18, TextField19, TextField20;

	private boolean Notif1, Notif2, Notif3, Notif4, Notif5, Notif6, Notif7, Notif8, Notif9, Notif10;
	private String NotifMSG1, NotifMSG2, NotifMSG3, NotifMSG4, NotifMSG5, NotifMSG6, NotifMSG7, NotifMSG8, NotifMSG9,
			NotifMSG10;
	private String NotifALT1, NotifALT2, NotifALT3, NotifALT4, NotifALT5, NotifALT6, NotifALT7, NotifALT8, NotifALT9,
			NotifALT10;
	private int Checker1, Checker2, Checker3, Checker4, Checker5, Checker6, Checker7, Checker8, Checker9, Checker10;

	public int getChecker1() {
		return Checker1;
	}

	public void setChecker1(int checker1) {
		Checker1 = checker1;
	}

	public int getChecker2() {
		return Checker2;
	}

	public void setChecker2(int checker2) {
		Checker2 = checker2;
	}

	public int getChecker3() {
		return Checker3;
	}

	public void setChecker3(int checker3) {
		Checker3 = checker3;
	}

	public int getChecker4() {
		return Checker4;
	}

	public void setChecker4(int checker4) {
		Checker4 = checker4;
	}

	public int getChecker5() {
		return Checker5;
	}

	public void setChecker5(int checker5) {
		Checker5 = checker5;
	}

	public int getChecker6() {
		return Checker6;
	}

	public void setChecker6(int checker6) {
		Checker6 = checker6;
	}

	public int getChecker7() {
		return Checker7;
	}

	public void setChecker7(int checker7) {
		Checker7 = checker7;
	}

	public int getChecker8() {
		return Checker8;
	}

	public void setChecker8(int checker8) {
		Checker8 = checker8;
	}

	public int getChecker9() {
		return Checker9;
	}

	public void setChecker9(int checker9) {
		Checker9 = checker9;
	}

	public int getChecker10() {
		return Checker10;
	}

	public void setChecker10(int checker10) {
		Checker10 = checker10;
	}

	public Data() {
		Notif1 = false;
		Notif2 = false;
		Notif3 = false;
		Notif4 = false;
		Notif5 = false;
		Notif6 = false;
		Notif7 = false;
		Notif8 = false;
		Notif9 = false;
		Notif10 = false;

		NotifMSG1 = null;
		NotifMSG2 = null;
		NotifMSG3 = null;
		NotifMSG4 = null;
		NotifMSG5 = null;
		NotifMSG6 = null;
		NotifMSG7 = null;
		NotifMSG8 = null;
		NotifMSG9 = null;
		NotifMSG10 = null;

		NotifALT1 = null;
		NotifALT2 = null;
		NotifALT3 = null;
		NotifALT4 = null;
		NotifALT5 = null;
		NotifALT6 = null;
		NotifALT7 = null;
		NotifALT8 = null;
		NotifALT9 = null;
		NotifALT10 = null;

		Checker1 = 0;
		Checker2 = 0;
		Checker3 = 0;
		Checker4 = 0;
		Checker5 = 0;
		Checker6 = 0;
		Checker7 = 0;
		Checker8 = 0;
		Checker9 = 0;
		Checker10 = 0;

		URLLabel1 = null;
		URLLabel2 = null;
		URLLabel3 = null;
		URLLabel4 = null;
		URLLabel5 = null;
		URLLabel6 = null;
		URLLabel7 = null;
		URLLabel8 = null;
		URLLabel9 = null;
		URLLabel10 = null;

		ClassLabel1 = null;
		ClassLabel2 = null;
		ClassLabel3 = null;
		ClassLabel4 = null;
		ClassLabel5 = null;
		ClassLabel6 = null;
		ClassLabel7 = null;
		ClassLabel8 = null;
		ClassLabel9 = null;
		ClassLabel10 = null;

		TextField1 = null;
		TextField2 = null;
		TextField3 = null;
		TextField4 = null;
		TextField5 = null;
		TextField6 = null;
		TextField7 = null;
		TextField8 = null;
		TextField9 = null;
		TextField10 = null;
		TextField11 = null;
		TextField12 = null;
		TextField13 = null;
		TextField14 = null;
		TextField15 = null;
		TextField16 = null;
		TextField17 = null;
		TextField18 = null;
		TextField19 = null;
		TextField20 = null;
	}

	public boolean isNotif1() {
		return Notif1;
	}

	public void setNotif1(boolean notif1) {
		Notif1 = notif1;
	}

	public boolean isNotif2() {
		return Notif2;
	}

	public void setNotif2(boolean notif2) {
		Notif2 = notif2;
	}

	public boolean isNotif3() {
		return Notif3;
	}

	public void setNotif3(boolean notif3) {
		Notif3 = notif3;
	}

	public boolean isNotif4() {
		return Notif4;
	}

	public void setNotif4(boolean notif4) {
		Notif4 = notif4;
	}

	public boolean isNotif5() {
		return Notif5;
	}

	public void setNotif5(boolean notif5) {
		Notif5 = notif5;
	}

	public boolean isNotif6() {
		return Notif6;
	}

	public void setNotif6(boolean notif6) {
		Notif6 = notif6;
	}

	public boolean isNotif7() {
		return Notif7;
	}

	public void setNotif7(boolean notif7) {
		Notif7 = notif7;
	}

	public boolean isNotif8() {
		return Notif8;
	}

	public void setNotif8(boolean notif8) {
		Notif8 = notif8;
	}

	public boolean isNotif9() {
		return Notif9;
	}

	public void setNotif9(boolean notif9) {
		Notif9 = notif9;
	}

	public boolean isNotif10() {
		return Notif10;
	}

	public void setNotif10(boolean notif10) {
		Notif10 = notif10;
	}

	public String getNotifMSG1() {
		return NotifMSG1;
	}

	public void setNotifMSG1(String notifMSG1) {
		NotifMSG1 = notifMSG1;
	}

	public String getNotifMSG2() {
		return NotifMSG2;
	}

	public void setNotifMSG2(String notifMSG2) {
		NotifMSG2 = notifMSG2;
	}

	public String getNotifMSG3() {
		return NotifMSG3;
	}

	public void setNotifMSG3(String notifMSG3) {
		NotifMSG3 = notifMSG3;
	}

	public String getNotifMSG4() {
		return NotifMSG4;
	}

	public void setNotifMSG4(String notifMSG4) {
		NotifMSG4 = notifMSG4;
	}

	public String getNotifMSG5() {
		return NotifMSG5;
	}

	public void setNotifMSG5(String notifMSG5) {
		NotifMSG5 = notifMSG5;
	}

	public String getNotifMSG6() {
		return NotifMSG6;
	}

	public void setNotifMSG6(String notifMSG6) {
		NotifMSG6 = notifMSG6;
	}

	public String getNotifMSG7() {
		return NotifMSG7;
	}

	public void setNotifMSG7(String notifMSG7) {
		NotifMSG7 = notifMSG7;
	}

	public String getNotifMSG8() {
		return NotifMSG8;
	}

	public void setNotifMSG8(String notifMSG8) {
		NotifMSG8 = notifMSG8;
	}

	public String getNotifMSG9() {
		return NotifMSG9;
	}

	public void setNotifMSG9(String notifMSG9) {
		NotifMSG9 = notifMSG9;
	}

	public String getNotifMSG10() {
		return NotifMSG10;
	}

	public void setNotifMSG10(String notifMSG10) {
		NotifMSG10 = notifMSG10;
	}

	public String getNotifALT1() {
		return NotifALT1;
	}

	public void setNotifALT1(String notifALT1) {
		NotifALT1 = notifALT1;
	}

	public String getNotifALT2() {
		return NotifALT2;
	}

	public void setNotifALT2(String notifALT2) {
		NotifALT2 = notifALT2;
	}

	public String getNotifALT3() {
		return NotifALT3;
	}

	public void setNotifALT3(String notifALT3) {
		NotifALT3 = notifALT3;
	}

	public String getNotifALT4() {
		return NotifALT4;
	}

	public void setNotifALT4(String notifALT4) {
		NotifALT4 = notifALT4;
	}

	public String getNotifALT5() {
		return NotifALT5;
	}

	public void setNotifALT5(String notifALT5) {
		NotifALT5 = notifALT5;
	}

	public String getNotifALT6() {
		return NotifALT6;
	}

	public void setNotifALT6(String notifALT6) {
		NotifALT6 = notifALT6;
	}

	public String getNotifALT7() {
		return NotifALT7;
	}

	public void setNotifALT7(String notifALT7) {
		NotifALT7 = notifALT7;
	}

	public String getNotifALT8() {
		return NotifALT8;
	}

	public void setNotifALT8(String notifALT8) {
		NotifALT8 = notifALT8;
	}

	public String getNotifALT9() {
		return NotifALT9;
	}

	public void setNotifALT9(String notifALT9) {
		NotifALT9 = notifALT9;
	}

	public String getNotifALT10() {
		return NotifALT10;
	}

	public void setNotifALT10(String notifALT10) {
		NotifALT10 = notifALT10;
	}

	public String getURLLabel1() {
		return URLLabel1;
	}

	public String getTextField11() {
		return TextField11;
	}

	public void setTextField11(String textField11) {
		TextField11 = textField11;
	}

	public String getTextField12() {
		return TextField12;
	}

	public void setTextField12(String textField12) {
		TextField12 = textField12;
	}

	public String getTextField13() {
		return TextField13;
	}

	public void setTextField13(String textField13) {
		TextField13 = textField13;
	}

	public String getTextField14() {
		return TextField14;
	}

	public void setTextField14(String textField14) {
		TextField14 = textField14;
	}

	public String getTextField15() {
		return TextField15;
	}

	public void setTextField15(String textField15) {
		TextField15 = textField15;
	}

	public String getTextField16() {
		return TextField16;
	}

	public void setTextField16(String textField16) {
		TextField16 = textField16;
	}

	public String getTextField17() {
		return TextField17;
	}

	public void setTextField17(String textField17) {
		TextField17 = textField17;
	}

	public String getTextField18() {
		return TextField18;
	}

	public void setTextField18(String textField18) {
		TextField18 = textField18;
	}

	public String getTextField19() {
		return TextField19;
	}

	public void setTextField19(String textField19) {
		TextField19 = textField19;
	}

	public String getTextField20() {
		return TextField20;
	}

	public void setTextField20(String textField20) {
		TextField20 = textField20;
	}

	public void setURLLabel1(String uRLLabel1) {
		URLLabel1 = uRLLabel1;
	}

	public String getURLLabel2() {
		return URLLabel2;
	}

	public void setURLLabel2(String uRLLabel2) {
		URLLabel2 = uRLLabel2;
	}

	public String getURLLabel3() {
		return URLLabel3;
	}

	public void setURLLabel3(String uRLLabel3) {
		URLLabel3 = uRLLabel3;
	}

	public String getURLLabel4() {
		return URLLabel4;
	}

	public void setURLLabel4(String uRLLabel4) {
		URLLabel4 = uRLLabel4;
	}

	public String getURLLabel5() {
		return URLLabel5;
	}

	public void setURLLabel5(String uRLLabel5) {
		URLLabel5 = uRLLabel5;
	}

	public String getURLLabel6() {
		return URLLabel6;
	}

	public void setURLLabel6(String uRLLabel6) {
		URLLabel6 = uRLLabel6;
	}

	public String getURLLabel7() {
		return URLLabel7;
	}

	public void setURLLabel7(String uRLLabel7) {
		URLLabel7 = uRLLabel7;
	}

	public String getURLLabel8() {
		return URLLabel8;
	}

	public void setURLLabel8(String uRLLabel8) {
		URLLabel8 = uRLLabel8;
	}

	public String getURLLabel9() {
		return URLLabel9;
	}

	public void setURLLabel9(String uRLLabel9) {
		URLLabel9 = uRLLabel9;
	}

	public String getURLLabel10() {
		return URLLabel10;
	}

	public void setURLLabel10(String uRLLabel10) {
		URLLabel10 = uRLLabel10;
	}

	public String getClassLabel1() {
		return ClassLabel1;
	}

	public void setClassLabel1(String classLabel1) {
		ClassLabel1 = classLabel1;
	}

	public String getClassLabel2() {
		return ClassLabel2;
	}

	public void setClassLabel2(String classLabel2) {
		ClassLabel2 = classLabel2;
	}

	public String getClassLabel3() {
		return ClassLabel3;
	}

	public void setClassLabel3(String classLabel3) {
		ClassLabel3 = classLabel3;
	}

	public String getClassLabel4() {
		return ClassLabel4;
	}

	public void setClassLabel4(String classLabel4) {
		ClassLabel4 = classLabel4;
	}

	public String getClassLabel5() {
		return ClassLabel5;
	}

	public void setClassLabel5(String classLabel5) {
		ClassLabel5 = classLabel5;
	}

	public String getClassLabel6() {
		return ClassLabel6;
	}

	public void setClassLabel6(String classLabel6) {
		ClassLabel6 = classLabel6;
	}

	public String getClassLabel7() {
		return ClassLabel7;
	}

	public void setClassLabel7(String classLabel7) {
		ClassLabel7 = classLabel7;
	}

	public String getClassLabel8() {
		return ClassLabel8;
	}

	public void setClassLabel8(String classLabel8) {
		ClassLabel8 = classLabel8;
	}

	public String getClassLabel9() {
		return ClassLabel9;
	}

	public void setClassLabel9(String classLabel9) {
		ClassLabel9 = classLabel9;
	}

	public String getClassLabel10() {
		return ClassLabel10;
	}

	public void setClassLabel10(String classLabel10) {
		ClassLabel10 = classLabel10;
	}

	public String getTextField1() {
		return TextField1;
	}

	public void setTextField1(String textField1) {
		TextField1 = textField1;
	}

	public String getTextField2() {
		return TextField2;
	}

	public void setTextField2(String textField2) {
		TextField2 = textField2;
	}

	public String getTextField3() {
		return TextField3;
	}

	public void setTextField3(String textField3) {
		TextField3 = textField3;
	}

	public String getTextField4() {
		return TextField4;
	}

	public void setTextField4(String textField4) {
		TextField4 = textField4;
	}

	public String getTextField5() {
		return TextField5;
	}

	public void setTextField5(String textField5) {
		TextField5 = textField5;
	}

	public String getTextField6() {
		return TextField6;
	}

	public void setTextField6(String textField6) {
		TextField6 = textField6;
	}

	public String getTextField7() {
		return TextField7;
	}

	public void setTextField7(String textField7) {
		TextField7 = textField7;
	}

	public String getTextField8() {
		return TextField8;
	}

	public void setTextField8(String textField8) {
		TextField8 = textField8;
	}

	public String getTextField9() {
		return TextField9;
	}

	public void setTextField9(String textField9) {
		TextField9 = textField9;
	}

	public String getTextField10() {
		return TextField10;
	}

	public void setTextField10(String textField10) {
		TextField10 = textField10;
	}

}
