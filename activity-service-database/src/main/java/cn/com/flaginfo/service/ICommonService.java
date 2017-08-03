package cn.com.flaginfo.service;

public interface ICommonService<T> {

	public	 T	    getById( String id );
	public	void	deleteById( String id );
	public	void	update( T o );
	public	void	insert( T o );
	
}
