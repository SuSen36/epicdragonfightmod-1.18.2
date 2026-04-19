package susen36.epicdragonfight.entitypatch;

public interface IEndCrystalPatch {

	boolean hasShield();

	void setShield(boolean shield);

	int getShieldHealth();

	void setShieldHealth(int value);

	void addShieldHealth(int amount);

	int getMaxShieldHealth();

	void setMaxShieldHealth(int value);

	int getTempShieldHealth();

	void setTempShieldHealth(int value);

	void addTempShieldHealth(int amount);
}
