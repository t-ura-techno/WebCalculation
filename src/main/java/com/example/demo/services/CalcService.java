
package com.example.demo.services;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class CalcService {

	// 足し算のメソッド
	public String calculateAdd(String addNumA, String addNumB) {

		// ①.Stringで渡された入力値を数値に変換
		BigDecimal numA = new BigDecimal(addNumA);
		BigDecimal numB = new BigDecimal(addNumB);

		// ②.NumAとNumBを足し算
		BigDecimal addNumResult = numA.add(numB);

		// ③.②の結果をStringに変換
		String Result = addNumResult.toString();

		// ④.③を呼び出し元に返す
		return Result;

	}
	// 割り算に関しては特殊なので注意
	//
	// ヒントとしてtry、catch構文も記載はしておきます。
	//
	// 後は調べてね！

	// try {
	// BigDecimal AdR = 〇〇.〇〇(AdB);
	// return AdR.toString();
	// } catch (Exception e) {
	// return "無限小数の答えになりました";
	// }

	/*
	 * このコメントアウトは消さない方がいい これは無限少数の桁を設定する際に必要 BigDecimal AdR =
	 * AdA.divide(AdB,7,RoundingMode.HALF_UP); //BigDecimal 〇〇= 〇〇.add(〇〇);
	 * これは足し算を書くとき String AdResult =
	 * AdR.toString();//toStringはクラスで定義されている文字列表現を返すメソッド return AdResult;
	 */
}
