package jp.co.ixui.tamura.controller.signup;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import jp.co.ixui.tamura.controller.signup.validator.annotation.PasswordEquals;
import jp.co.ixui.tamura.controller.signup.validator.annotation.UserExists;
import lombok.Getter;
import lombok.Setter;

/**
 * @author kawasaki
 *
 */
@Getter
@Setter
@UserExists
@PasswordEquals(fieldPass="pass", fieldConfirmPass="confirmPass")
public class SignupForm {

	@NotEmpty(message="社員番号を入力してください")
	private String empNo;

	@NotEmpty(message="名前を入力してください")
	private String name;

	@NotEmpty(message="パスワードを入力してください")
	@Size(min = 8, message="パスワードは8文字以上で入力してください")
	private String pass;

	@NotEmpty(message="確認用パスワードを入力してください")
	private String confirmPass;

	@NotEmpty(message="選択してください")
	private String auth;
}
