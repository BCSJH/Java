public class Music{
	private String song;//�뷡
	private String singer;//����
	int day;//�߸���
    
	public Music(String song, String singer,int day){//������
        this.song = song;
        this.singer = singer;
        this.day = day;
    }
	
	public void result() {

			System.out.println("�뷡�̸� : "+song+"  ���� : "+singer+"  �߸��� : "+day);
		
	}

}