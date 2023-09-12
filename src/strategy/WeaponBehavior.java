package strategy;

/*
 * we're making this an interface as we don't need to define any behavior ourselves
 * we're just making sure that anyone implementing this HAS TO know how to use a weapon.
 * THIS is our STRATEGY.
 */
public interface WeaponBehavior {
    void useWeapon();
}
