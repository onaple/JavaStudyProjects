package tankWarCongGou.entity;

/**
 * 
 * @author Doctor邓
 * 坦克的抽象类
 */
public abstract  class Tank {
	//坦克的速度
	private int speed;
	//坦克的x, y轴坐标
	private int x;
	private int y;
	//坦克的宽度和高度
	private final int WIDTH = 30;
	private final int HEIGHT = 30;
	//坦克在碰撞墙前的坐标
	private int oldX;
	private int oldY;
	//坦克的方向
	enum Direction{Up, Right, Down, Left};
	private Direction dir;
	//坦克的运动状态,默认为false即不可移动状态，true为可移动状态
	private boolean motionStatus;
	//坦克的 存活标识,默认为true即为存活状态，false为死亡状态
	private boolean live;
	//坦克的阵营,有子类去选择，true为我方阵营，false为敌方阵营
	private boolean camp;
	
	public Tank() {
		this.speed = 3;
		this.motionStatus = false;  
		this.live = true;
	}
	
	/**
	 * 坦克移动的方法
	 */
	public abstract void move();
	
	
}