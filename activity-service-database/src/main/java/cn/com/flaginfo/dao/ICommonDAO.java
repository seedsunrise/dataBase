package cn.com.flaginfo.dao;


public interface ICommonDAO<T>{
	
	public	 T	    getById( String id );
	public	void	deleteById( String id );
	public	void	update( T o );
	public	void	insert( T o );

}
