package vonzeeple.maplesyrup.common;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import vonzeeple.maplesyrup.MapleSyrup;
import vonzeeple.maplesyrup.common.blocks.*;
import vonzeeple.maplesyrup.common.items.ItemHydrometer;
import vonzeeple.maplesyrup.common.items.ItemMapleSyrupBottle;
import vonzeeple.maplesyrup.common.items.ItemPancakeMix;
import vonzeeple.maplesyrup.common.items.ItemPancakes;


//Inject values from registry
public class Content {

    @ObjectHolder("maplesyrup:evaporator")//format modid:name
    public static final BlockEvaporator blockEvaporator = null;

    @ObjectHolder("maplesyrup:maple_log")//format modid:name
    public static final BlockMapleLog blockMapleLog = null;

    @ObjectHolder("maplesyrup:maple_leaves")//format modid:name
    public static final BlockMapleLeaves blockMapleLeaves = null;

    @ObjectHolder("maplesyrup:tree_tap")//format modid:name
    public static final BlockTreeTap blockTreeTap = null;

    @ObjectHolder("maplesyrup:maple_sapling")//format modid:name
    public static final BlockMapleSapling blockMapleSapling = null;

    @ObjectHolder("maplesyrup:maple_sap_fluid")//format modid:name
    public static final BlockFluid blockFluidMapleSap = null;

    @ObjectHolder("maplesyrup:maple_syrup_fluid")//format modid:name
    public static final BlockFluid blockFluidMapleSyrup = null;
    //public static final BlockFluidMapleSyrup blockFluidMapleSyrup = null;


    @ObjectHolder("maplesyrup:pancakes")//format modid:name
    public static final ItemPancakes itemPancakes = null;
    //public static final BlockFluidMapleSyrup blockFluidMapleSyrup = null;

    @ObjectHolder("maplesyrup:pancakemix")//format modid:name
    public static final ItemPancakeMix itemPancakeMix = null;
    //public static final BlockFluidMapleSyrup blockFluidMapleSyrup = null;

    @ObjectHolder("maplesyrup:bottle_maplesyrup")//format modid:name
    public static final ItemMapleSyrupBottle itemMapleSyrupBottle = null;

    @ObjectHolder("maplesyrup:hydrometer")//format modid:name
    public static final ItemHydrometer itemHydrometer = null;


    public static final Fluid fluidMapleSap = new Fluid("maple_sap_fluid",new ResourceLocation(MapleSyrup.MODID+":blocks/maplesap_still"),new ResourceLocation(MapleSyrup.MODID+":blocks/maplesap_flow"));
    public static final Fluid fluidMapleSyrup = new Fluid("maple_syrup_fluid",new ResourceLocation(MapleSyrup.MODID+":blocks/maplesyrup_still"),new ResourceLocation(MapleSyrup.MODID+":blocks/maplesyrup_flow"));


}