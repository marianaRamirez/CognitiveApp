package src;

import com.ibm.watson.developer_cloud.language_translation.v2.LanguageTranslation;
import com.ibm.watson.developer_cloud.language_translation.v2.model.Language;
import com.ibm.watson.developer_cloud.language_translation.v2.model.TranslationResult;

public class Main {

	public static void main(String[] args) {
		LanguageTranslation service = new LanguageTranslation();


	    TranslationResult translationResult = service.translate("hello", Language.ENGLISH, Language.SPANISH).execute();

	    System.out.println(translationResult);

	}

}
