package Util;


import java.util.ArrayList;

public class kamojiAPI {
	
	public static ArrayList<String> joy = new ArrayList<>();
	public static String[] listjoy;
	
	public static enum kamojitype {
		JOY,
		
	}
	
	public static void init() {
		joy.clear();
		joy.add("(* ^ ω ^)");
		joy.add("٩(◕‿◕｡)۶");
		joy.add("☆*:.｡.o(≧▽≦)o.｡.:*☆");
		joy.add("(´｡• ω •｡`)");
		joy.add("٩(◕‿◕｡)۶");
		joy.add("(o_ _)ﾉ彡☆");
		joy.add("(≧◡≦)");
		joy.add("╰(▔∀▔)╯");
		joy.add("(*≧ω≦*)");
		joy.add("＼(≧▽≦)／");
		joy.add("ヽ(o＾▽＾o)ノ");
		joy.add("☆ ～('▽^人)");
		joy.add("o(≧▽≦)o");
		joy.add("٩(◕‿◕)۶");
		
		System.out.println("[KamojiAPI - Beta]: Loaded Module Joy");
		
		listjoy = joy.toArray(new String[0]);
	}
	
	public static String get(kamojitype type) {
		switch(type) {
		
		case JOY:
			int length = listjoy.length;
	        int rand = (int) (Math.random() * length);
	        return (listjoy[rand]);
		}
		return null;
	}

}
