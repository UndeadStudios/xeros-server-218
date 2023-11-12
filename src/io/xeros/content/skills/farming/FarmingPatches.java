package io.xeros.content.skills.farming;


import io.xeros.model.Items;
import io.xeros.model.entity.player.Position;

public enum FarmingPatches {

	CATHERBY_ALLOTMENT_NORTH(new Position(2805, 3465), new Position(2815, 3469), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.ALLOTMENT),
	CATHERBY_ALLOTMENT_SOUTH(new Position(2805, 3458), new Position(2815, 3461), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.ALLOTMENT),
	CATHERBY_HERB(new Position(2813, 3462), new Position(2815, 3464), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.HERB),
	CATHERBY_FLOWER(new Position(2808, 3462), new Position(2811, 3465), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.FLOWER),
	FALADOR_HERB(new Position(3058, 3310), new Position(3060, 3313), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.HERB),
	FALADOR_FLOWER(new Position(3054, 3306), new Position(3056, 3307), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.FLOWER),
	FALADOR_ALLOTMENT_NORTH(new Position(3050, 3306), new Position(3055, 3312), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.ALLOTMENT),
	FALADOR_ALLOTMENT_SOUTH(new Position(3055, 3302), new Position(3059, 3309), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.ALLOTMENT),

	ARDOUGNE_HERB(new Position(2670, 3374), new Position(2671, 3375), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.HERB),
	ARDOUGNE_FLOWER(new Position(2666, 3374), new Position(2667, 3375), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.FLOWER),
	ARDOUGNE_ALLOTMENT_NORTH(new Position(2662, 3377), new Position(2671, 3379), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.ALLOTMENT),
	ARDOUGNE_ALLOTMENT_SOUTH(new Position(2662, 3370), new Position(2671, 3372), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.ALLOTMENT),

	PHAS_HERB(new Position(3605, 3529), new Position(3606, 3530), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.HERB),
	PHAS_FLOWER(new Position(3601, 3525), new Position(3602, 3526), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.FLOWER),
	PHAS_ALLOTMENT_WEST(new Position(3597, 3525), new Position(3601, 3530), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.ALLOTMENT),
	PHAS_ALLOTMENT_EAST(new Position(3602, 3521), new Position(3606, 3526), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.ALLOTMENT),

	LUMBRIDGE_TREE(new Position(3191, 3229, 0), new Position(3195, 3233, 0), Farming.HARVEST_CHOPPING, 952, 952, SeedType.TREE),
	VARROCK_TREE(new Position(3227, 3457, 0), new Position(3231, 3461, 0), Farming.HARVEST_CHOPPING, 952, 952, SeedType.TREE),
	FALADOR_TREE(new Position(3002, 3371, 0), new Position(3006, 3375, 0), Farming.HARVEST_CHOPPING, 952, 952, SeedType.TREE),
	TAVERLY_TREE(new Position(2934, 3436, 0), new Position(2938, 3440, 0), Farming.HARVEST_CHOPPING, 952, 952, SeedType.TREE),
	STRONGHOLD_TREE(new Position(2434, 3413, 0), new Position(2438, 3417, 0), Farming.HARVEST_CHOPPING, 952, 952, SeedType.TREE),

	LUMBRIDGE_HOPS(new Position(3226, 3312, 0), new Position(3232, 3318, 0), Farming.HARVEST_CHOPPING, 952, 952, SeedType.HOPS),
	CAMELOT_HOPS(new Position(2663, 3522, 0), new Position(2670, 3529, 0), Farming.HARVEST_CHOPPING, 952, 952, SeedType.HOPS),
	YANILLE_HOPS(new Position(2573, 3102, 0), new Position(2578, 3107, 0), Farming.HARVEST_CHOPPING, 952, 952, SeedType.HOPS),

	RIMMINGTON_BUSH(new Position(2939, 3220, 0), new Position(2942, 3223, 0), Farming.HARVEST_ANIMATION, 952, 952, SeedType.BUSH),
	ARDOUGNE_BUSH(new Position(2616, 3224, 0), new Position(2619, 3227, 0), Farming.HARVEST_ANIMATION, 952, 952, SeedType.BUSH),
	ETCETRIA_BUSH(new Position(2590, 3862, 0), new Position(2593, 3865, 0), Farming.HARVEST_ANIMATION, 952, 952, SeedType.BUSH),

	STRONGHOLD_FRUIT_TREE(new Position(2474, 3444, 0), new Position(2477, 3447, 0), Farming.HARVEST_CHOPPING, 952, 952, SeedType.FRUIT_TREE),
	CATHERBY_FRUIT_TREE(new Position(2859, 3432, 0), new Position(2862, 3435, 0), Farming.HARVEST_CHOPPING, 952, 952, SeedType.FRUIT_TREE),
	MAZE_FRUIT_TREE(new Position(2488, 3178, 0), new Position(2491, 3181, 0), Farming.HARVEST_CHOPPING, 952, 952, SeedType.FRUIT_TREE),
	BRIMHAVEN_FRUIT_TREE(new Position(2763, 3211, 0), new Position(2766, 3214, 0), Farming.HARVEST_CHOPPING, 952, 952, SeedType.FRUIT_TREE),
	LLETYA_FRUIT_TREE(new Position(2345, 3160, 0), new Position(2348, 3163, 0), Farming.HARVEST_CHOPPING, 952, 952, SeedType.FRUIT_TREE),
	PORT_SARIM_SPIRIT_TREE(new Position(3058, 3256, 0), new Position(3062, 3260, 0), Farming.HARVEST_CHOPPING, 952, 952, SeedType.SPIRIT_TREE),
	BRIMHAVEN_SPIRIT_TREE(new Position(2800, 3201, 0), new Position(2804, 3205, 0), Farming.HARVEST_CHOPPING, 952, 952, SeedType.SPIRIT_TREE),
	ETCETRIA_SPIRIT_TREE(new Position(2611, 3856, 0), new Position(2615, 3860, 0), Farming.HARVEST_CHOPPING, 952, 952, SeedType.SPIRIT_TREE),

	FARMING_GUILD_REDWOOD(new Position(1224, 3750, 0), new Position(1233, 3759, 0), Farming.HARVEST_CHOPPING, 952, 952, SeedType.REDWOOD),
	FARMING_GUILD_SPIRIT_TREE(new Position(1251, 3748, 0), new Position(1255, 3752, 0), Farming.HARVEST_CHOPPING, 952, 952, SeedType.SPIRIT_TREE),
	FARMING_GUILD_HERB(new Position(1237, 3725, 0), new Position(1240, 3728, 0), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.HERB),
	FARMING_GUILD_CELASTRUS(new Position(1242, 3748, 0), new Position(1246, 3752, 0),Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.CELASTRUS),
	FARMING_GUILD_FRUIT_TREE(new Position(1241, 3757, 0), new Position(1244, 3760, 0), Farming.HARVEST_CHOPPING, 952, 952, SeedType.FRUIT_TREE),
	FARMING_GUILD_TREE(new Position(1230, 3734, 0), new Position(1234, 3738, 0), Farming.HARVEST_CHOPPING, 952, 952, SeedType.TREE),
	FARMING_GUILD_ANIMA(new Position(1230, 3721, 0), new Position(1234, 3725, 0), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.HERB),
	FARMING_GUILD_FLOWER(new Position(1259, 3724, 0), new Position(1262, 3727, 0), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.FLOWER),
	FARMING_GUILD_ALLOTMENT_SOUTH(new Position(1266, 3722, 0), new Position(1273, 3728), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.ALLOTMENT),
	FARMING_GUILD_ALLOTMENT_NORTH(new Position(1266,3731,0), new Position(1272,3737,0), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.ALLOTMENT),
	FARMING_GUILD_BUSH(new Position(1259, 3732, 0), new Position(1262, 3735, 0), Farming.HARVEST_ANIMATION, 952, 952, SeedType.BUSH),
	FARMING_GUILD_CACTUS(new Position(1263, 3746, 0), new Position(1266, 3749, 0), Farming.HARVEST_ANIMATION, 952, 952, SeedType.CACTUS),

	HOSIDIUS_HERB(new Position(1737,3549,0), new Position(1740,3552,0), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.HERB),
	HOSIDIUS_FLOWER(new Position(1733,3553,0), new Position(1736,3556,0), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.FLOWER),
	HOSIDIUS_ALLOTMENT_NORTH(new Position(1737,3553,0), new Position(1740,3560,0), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.ALLOTMENT),
	HOSIDIUS_ALLOTMENT_SOUTH(new Position(1729,3549,0), new Position(1733,3553,0), Farming.HARVEST_ANIMATION, Items.SEED_DIBBER, Items.SECATEURS, SeedType.ALLOTMENT);

	public final Position bottomLeft;
	public final Position topLeft;
	public final int harvestAnimation;
	public final int harvestItem;
	public final int planter;
	public final SeedType seedType;

	FarmingPatches(Position bottomLeft, Position topLeft, int harvestAnimation, int planter, int harvestItem, SeedType seedType) {
		this.bottomLeft = bottomLeft;
		this.topLeft = topLeft;
		this.harvestItem = harvestItem;
		this.harvestAnimation = harvestAnimation;
		this.planter = planter;
		this.seedType = seedType;
	}
	}
