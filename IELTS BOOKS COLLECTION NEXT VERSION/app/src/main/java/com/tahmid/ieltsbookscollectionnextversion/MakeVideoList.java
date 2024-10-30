
package com.tahmid.ieltsbookscollectionnextversion;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by Juba
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by Juba
	public static void createPlayListForVideo(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================

	//===============================Some automation by Juba
	public static void createCategoryForWebsite(String category_name, Integer drawable, String url){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		hashMap.put("url", url);
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================

	//===============================Some automation by Juba
	public static void createCategoryForPDF(String category_name, Integer drawable, String pdfAssetName){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		hashMap.put("pdfAssetName", pdfAssetName);
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();


		//===========================Category for PDF Viewer
		createCategoryForPDF("IELTS BOOK PART 11", R.drawable.i11, "P11_compressed.pdf");
		//==========================================================================*

		//===========================Category for PDF Viewer
		createCategoryForPDF("IELTS BOOK PART 12", R.drawable.i12, "p12_compressed.pdf");
		//==========================================================================*



		//===========================Category for PDF Viewer
		createCategoryForPDF("IELTS BOOK PART 13", R.drawable.i13, "P13_compressed.pdf");
		//==========================================================================*


		//===========================Category for PDF Viewer
		createCategoryForPDF("IELTS BOOK PART 14", R.drawable.i14, "P14_compressed.pdf");
		//==========================================================================*

		//===========================Category for PDF Viewer
		createCategoryForPDF("IELTS BOOK PART 15", R.drawable.i15, "p15_compressed.pdf");
		//==========================================================================*



		//===========================Category for PDF Viewer
		createCategoryForPDF("IELTS BOOK PART 16", R.drawable.i16, "p16_compressed.pdf");
		//==========================================================================*



		//===========================Category for PDF Viewer
		createCategoryForPDF("IELTS BOOK PART 17", R.drawable.i17, "P17_compressed.pdf");
		//==========================================================================*






	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}

