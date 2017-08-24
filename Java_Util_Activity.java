package test.javapro;

import java.util.*;
import java.text.SimpleDateFormat;

public class Java_Util_Activity {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
		String date = sdf.format(new Date());
		System.out.println(date);
		sdf = new SimpleDateFormat("MM/d/yy h:mm a");
		date = sdf.format(new Date());
		System.out.println(date);
		sdf = new SimpleDateFormat("h:mm:ss a");
		date = sdf.format(new Date());
		System.out.println(date);
		sdf = new SimpleDateFormat("MMM d, yyyy h:mm:ss a");
		date = sdf.format(new Date());
		System.out.println(date);
		sdf = new SimpleDateFormat("MM/d/yy h:mm a");
		date = sdf.format(new Date());
		System.out.println(date);
		sdf = new SimpleDateFormat("h:mm a");
		date = sdf.format(new Date());
		System.out.println(date);
		sdf = new SimpleDateFormat("h:mm:ss a");
		date = sdf.format(new Date());
		System.out.println(date);
		sdf = new SimpleDateFormat("h:mm:ss a z");
		date = sdf.format(new Date());
		System.out.println(date);
		sdf = new SimpleDateFormat("M/d/yy h:mm a");
		date = sdf.format(new Date());
		System.out.println(date);
		sdf = new SimpleDateFormat("MMM d, yyyy h:mm a");
		date = sdf.format(new Date());
		System.out.println(date);
		sdf = new SimpleDateFormat("MMMM d, yyy h:mm:ss a z");
		date = sdf.format(new Date());
		System.out.println(date);
	}
}
