package test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class Test1 {
	public static void main(String[] args) {
		//testCalendar();
		//getSixRandomInteger();
		testObjectValue();
	}


	//日历
	@SuppressWarnings("static-access")
	public static void testCalendar(){
		Calendar cld=Calendar.getInstance();
		System.out.println(cld.ALL_STYLES);
		System.out.println(cld.getTimeZone());
	}

	//Random
	public static int getSixRandomInteger(){
		Random random = new Random();
		int x = random.nextInt(899999);
		x = x + 100000;
		System.out.println(x);
		for(int i=1;i<10;i++){
			System.out.println(random.nextDouble());
		}

		return x;
	}

	//判断map值
	public static void testObjectValue(){
		Map<String, Object> map = new HashMap<String, Object>();

		String value1 = "hello";
		map.put("value1", value1);

		int value2 = 234;
		map.put("value2", value2);

		Integer value3=567;
		map.put("value3", value3);

		Integer[] value4=new Integer[3];
		value4[0]=8;
		value4[1]=9;
		value4[2]=10;
		map.put("value4", value4);
		
		String value5 = "";
		map.put("value5", value5);

		int value6 = 0;
		map.put("value6", value6);

		Integer value7=null;
		map.put("value7", value7);

		Integer[] value8=new Integer[3];
		map.put("value8", value8);
		
		List<Integer> list = Arrays.asList(value8);
		System.out.println("集合："+list);
		System.out.println(list.size());
		for(Entry<String, Object> entry : map.entrySet()){
			Object value = entry.getValue();
			System.out.println("key:"+entry.getKey());
			if(value==null||value==""){
				System.out.println(entry.getKey());
			}else if(value.getClass().isArray()){
				System.out.println("数组："+entry.getKey());
				
				if (((Object[])value).length==0){//此处要求数组类型必须是object类或子类，不能是基本数据类
					System.out.println("数组为空");
				}
			}
		}
		
	}

}
