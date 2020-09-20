package com.ssm.controller;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * ��0 0 12 * * ?��                ÿ������12�㴥��
		 
��0 15 10 ? * *��               ÿ������10:15����
 
��0 15 10 * * ?��               ÿ������10:15����
 
��0 15 10 * * ? *��             ÿ������10:15����
 
��0 15 10 * * ? 2005��          2005���ÿ������10:15 ����
 
��0 * 14 * * ?��                ��ÿ������2�㵽����2:59�ڼ��ÿ1���Ӵ���
 
��0 0/5 14 * * ?��              ��ÿ������2�㵽����2:55�ڼ��ÿ5���Ӵ���
 
��0 0/5 14,18 * * ?��           ��ÿ������2�㵽2:55�ڼ������6�㵽6:55�ڼ��ÿ5���Ӵ���
 
��0 0-5 14 * * ?��              ��ÿ������2�㵽����2:05�ڼ��ÿ1���Ӵ���
 
��0 10,44 14 ? 3 WED��          ÿ�����µ�������������2:10��2:44����
 
��0 15 10 ? * MON-FRI��         ��һ�����������10:15����
 
��0 15 10 15 * ?��              ÿ��15������10:15����
 
��0 15 10 L * ?��               ÿ�����һ�յ�����10:15����
 
��0 15 10 ? * 6L��              ÿ�µ����һ������������10:15����
 
��0 15 10 ? * 6L 2002-2005��    2002����2005���ÿ�µ����һ������������10:15����
 
��0 15 10 ? * 6#3��             ÿ�µĵ���������������10:15����
 
0 6 * * *                     ÿ������6��
 
0 /2 * *                      ÿ����Сʱ
 
0 23-7/2��8 * * *             ����11�㵽����8��֮��ÿ����Сʱ�����ϰ˵�
 
0 11 4 * 1-3                  ÿ���µ�4�ź�ÿ����ݵ����һ�������������11��
 */
/**
 * @author ZYB
 * @date ����ʱ�䣺2020��7��7��
 * @serial
 * 
 * 
 * 
 * 
 */
@Component
@EnableScheduling // ��������������ע��Ҳ�����ڵ�ǰ�ļ�
public class Testjob {
//	@Scheduled(cron = "0/10 * * * * ?")
//	public void runfirst() {
//		
//		System.out.println("********first job is ok******");
//	}

	@Scheduled(fixedRate = 1000 * 10)
	public void runsecend() {
		System.out.println("��ʱͬ������");
	}
//
//	@Scheduled(fixedDelay = 1000)
//	public void runThird() {
//		System.out.println("********third job is ok*******");
//	}
}
