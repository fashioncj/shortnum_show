package com.online.shortphonenumshow;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import android.util.Log;



	public class PhoneBootReceiver extends BroadcastReceiver { 
		
	
	
	    //��дonReceive����  
	    @Override  
	    public void onReceive(Context context, Intent intent) {  
	        //��ߵ�XXX.class����Ҫ�����ķ���  
	        Intent service = new Intent(context,Online_shortservise.class);  
	        context.startService(service);  
	        Log.v("TAG", "�����Զ������Զ�����.....");  
	        //����Ӧ�ã�����Ϊ��Ҫ�Զ�������Ӧ�õİ���
	         //Intent intent = getPackageManager().getLaunchIntentForPackage(packageName);
           
	       //context.startActivity(intent );   
	        //context.getSystemService(Context.TELEPHONY_SERVICE);
	        //TelephonyManager telM = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
	        //telM.listen(new TelListener(context), PhoneStateListener.LISTEN_CALL_STATE);
	        //context.getApplicationContext().getSystemService(Context.WINDOW_SERVICE); 
	       
	    }  
	    
	  
	}  

