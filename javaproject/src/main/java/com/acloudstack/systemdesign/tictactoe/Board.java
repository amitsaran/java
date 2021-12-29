package com.acloudstack.systemdesign.tictactoe;

public class Board {
	private int size;
	
	Board(int size){
		this.setSize(size);
	}

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
}
