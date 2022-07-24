package rbasamoyai.createbigcannons.ponder;

import com.simibubi.create.foundation.ponder.PonderRegistrationHelper;

import rbasamoyai.createbigcannons.CBCBlocks;
import rbasamoyai.createbigcannons.CreateBigCannons;

public class CBCPonderIndex {

	private static final PonderRegistrationHelper HELPER = new PonderRegistrationHelper(CreateBigCannons.MOD_ID);
	
	public static void register() {
		HELPER.forComponents(CBCBlocks.CANNON_MOUNT, CBCBlocks.YAW_CONTROLLER)
			.addStoryBoard("cannon_mount/assembly_and_use", CannonMountScenes::assemblyAndUse)
			.addStoryBoard("cannon_mount/firing_big_cannons", CannonMountScenes::firingBigCannons);
		
		HELPER.forComponents(CBCBlocks.CANNON_LOADER, CBCBlocks.RAM_HEAD, CBCBlocks.WORM_HEAD)
			.addStoryBoard("cannon_loader/loading_big_cannons", CannonLoadingScenes::loadingBigCannons);
		
		HELPER.forComponents(CBCBlocks.CANNON_LOADER, CBCBlocks.POWDER_CHARGE)
			.addStoryBoard("cannon_loader/optimal_cannon_loads", CannonLoadingScenes::optimalCannonLoads);
	}
	
}