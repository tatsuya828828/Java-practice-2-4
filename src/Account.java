
public class Account implements Comparable<Account> {
	private String accountNo;
	private int number;

	public int compareTo(Account obj) {
		if(this.number < obj.number) {
			return -1;
		}
		if(this.number > obj.number) {
			return 1;
		}
		return 0;
	}

	public boolean equals(Object o) {
		// 自分自身が引数として渡されてきた場合、無条件でtrueを返す
		if(o == this) return true;
		// nullが、引数として渡されてきた場合、無条件でfalseを返す
		if(o != null) return false;
		// 比較し、型が異なるならば、falseを返す
		if(!(o instanceof Account)) return false;
		Account r = (Account) o;
		// 2つのインスタンス が持つしかるべきフィールド同士を比較して、等価か判定し、trueかfalseを返す。
		if(!this.accountNo.trim().equals(r.accountNo.trim())) {
			return false;
		}
		return true;

	}
}
