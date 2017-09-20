package com.javaandexcel.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.javaandexcel.bean.GeoPoint;

/**
 * @author wpf 2016年11月8日
 */
public class MapUtils {

	public static Map<String, ArrayList<GeoPoint>> getMap() {

		Map<String, ArrayList<GeoPoint>> hasMap = new HashMap<String, ArrayList<GeoPoint>>();
		// -----------------------------------------------------------------------------------------------------------------

		// 顺义==顺分局
		ArrayList<GeoPoint> lis26 = new ArrayList<GeoPoint>();
		lis26.add(new GeoPoint(40.188765, 116.593586));
		lis26.add(new GeoPoint(40.149427, 116.594305));
		lis26.add(new GeoPoint(40.133763, 116.593083));
		lis26.add(new GeoPoint(40.115502, 116.595096));
		lis26.add(new GeoPoint(40.10551, 116.580229));
		lis26.add(new GeoPoint(40.089615, 116.585691));
		lis26.add(new GeoPoint(40.100874, 116.610699));
		lis26.add(new GeoPoint(40.118074, 116.711157));
		lis26.add(new GeoPoint(40.137714, 116.705551));
		lis26.add(new GeoPoint(40.187559, 116.738896));
		lis26.add(new GeoPoint(40.1977, 116.682555));
		lis26.add(new GeoPoint(40.201833, 116.657977));
		lis26.add(new GeoPoint(40.186257, 116.650862));
		lis26.add(new GeoPoint(40.192072, 116.649928));
		hasMap.put("顺义	新顺局", lis26);

		// 顺义==空港 分局
		ArrayList<GeoPoint> lis27 = new ArrayList<GeoPoint>();
		lis27.add(new GeoPoint(40.188765, 116.593586));
		lis27.add(new GeoPoint(40.20133, 116.564122));
		lis27.add(new GeoPoint(40.191851, 116.51626));
		lis27.add(new GeoPoint(40.206368, 116.500208));
		lis27.add(new GeoPoint(40.182119, 116.46945));
		lis27.add(new GeoPoint(40.162882, 116.49391));
		lis27.add(new GeoPoint(40.152125, 116.488709));
		lis27.add(new GeoPoint(40.123884, 116.497046));
		lis27.add(new GeoPoint(40.087752, 116.474804));
		lis27.add(new GeoPoint(40.08742, 116.488027));
		lis27.add(new GeoPoint(40.087476, 116.503693));
		lis27.add(new GeoPoint(40.077263, 116.518928));
		lis27.add(new GeoPoint(40.077152, 116.534595));
		lis27.add(new GeoPoint(40.064122, 116.551555));
		lis27.add(new GeoPoint(40.072501, 116.560538));
		lis27.add(new GeoPoint(40.068194, 116.5766));
		lis27.add(new GeoPoint(40.076918, 116.574516));
		lis27.add(new GeoPoint(40.081086, 116.579151));
		lis27.add(new GeoPoint(40.10551, 116.580229));
		lis27.add(new GeoPoint(40.115502, 116.595096));
		lis27.add(new GeoPoint(40.133763, 116.593083));
		lis27.add(new GeoPoint(40.149427, 116.594305));
		hasMap.put("顺义	空港分局", lis27);

		// 顺义==牛山分局
		ArrayList<GeoPoint> lis28 = new ArrayList<GeoPoint>();
		lis28.add(new GeoPoint(40.264263, 116.498285));
		lis28.add(new GeoPoint(40.246031, 116.528379));
		lis28.add(new GeoPoint(40.212099, 116.474912));
		lis28.add(new GeoPoint(40.222157, 116.480472));
		lis28.add(new GeoPoint(40.206368, 116.500208));
		lis28.add(new GeoPoint(40.191851, 116.51626));
		lis28.add(new GeoPoint(40.20133, 116.564122));
		lis28.add(new GeoPoint(40.188765, 116.593586));
		lis28.add(new GeoPoint(40.192072, 116.649928));
		lis28.add(new GeoPoint(40.190198, 116.706701));
		lis28.add(new GeoPoint(40.25223, 116.730704));
		lis28.add(new GeoPoint(40.277475, 116.675072));
		lis28.add(new GeoPoint(40.274173, 116.632384));
		lis28.add(new GeoPoint(40.263823, 116.62218));
		lis28.add(new GeoPoint(40.285401, 116.556064));
		hasMap.put("顺义	牛山分局", lis28);

		// 四区==酒仙桥（详）
		ArrayList<GeoPoint> lis29 = new ArrayList<GeoPoint>();
		lis29.add(new GeoPoint(39.977656, 116.475846));
		lis29.add(new GeoPoint(39.975278, 116.472827));
		lis29.add(new GeoPoint(39.969638, 116.476421));
		lis29.add(new GeoPoint(39.959795, 116.482601));
		lis29.add(new GeoPoint(39.964012, 116.49392));
		lis29.add(new GeoPoint(39.951222, 116.496363));
		lis29.add(new GeoPoint(39.951499, 116.501681));
		lis29.add(new GeoPoint(39.955426, 116.501034));
		lis29.add(new GeoPoint(39.959629, 116.515695));
		lis29.add(new GeoPoint(39.953669, 116.515623));
		lis29.add(new GeoPoint(39.956684, 116.523384));
		lis29.add(new GeoPoint(39.965035, 116.535242));
		lis29.add(new GeoPoint(39.977842, 116.546093));
		lis29.add(new GeoPoint(39.975465, 116.564059));
		lis29.add(new GeoPoint(39.9727, 116.572036));
		lis29.add(new GeoPoint(39.97082, 116.580876));
		lis29.add(new GeoPoint(39.97165, 116.589787));
		lis29.add(new GeoPoint(39.971428, 116.595895));
		lis29.add(new GeoPoint(39.977289, 116.605813));
		lis29.add(new GeoPoint(39.978174, 116.615011));
		lis29.add(new GeoPoint(39.963134, 116.634415));
		lis29.add(new GeoPoint(39.957493, 116.637289));
		lis29.add(new GeoPoint(39.952626, 116.651518));
		lis29.add(new GeoPoint(39.982376, 116.646057));
		lis29.add(new GeoPoint(39.993322, 116.649219));
		lis29.add(new GeoPoint(40.003823, 116.648356));
		lis29.add(new GeoPoint(40.011118, 116.64002));
		lis29.add(new GeoPoint(40.018302, 116.625647));
		lis29.add(new GeoPoint(40.020402, 116.607034));
		lis29.add(new GeoPoint(40.022557, 116.603225));
		lis29.add(new GeoPoint(40.038247, 116.577714));
		lis29.add(new GeoPoint(40.043135, 116.573545));
		lis29.add(new GeoPoint(40.055728, 116.552274));
		lis29.add(new GeoPoint(40.064122, 116.551555));
		lis29.add(new GeoPoint(40.077152, 116.534595));
		lis29.add(new GeoPoint(40.077263, 116.518928));
		lis29.add(new GeoPoint(40.087476, 116.503693));
		lis29.add(new GeoPoint(40.08742, 116.488027));
		lis29.add(new GeoPoint(40.05247, 116.488889));
		lis29.add(new GeoPoint(40.049653, 116.484793));
		lis29.add(new GeoPoint(40.05617, 116.485799));
		lis29.add(new GeoPoint(40.053519, 116.466755));
		lis29.add(new GeoPoint(40.045897, 116.466899));
		lis29.add(new GeoPoint(40.046933, 116.486643));
		lis29.add(new GeoPoint(40.021217, 116.494333));
		lis29.add(new GeoPoint(40.020222, 116.495123));
		lis29.add(new GeoPoint(40.011319, 116.506496));
		lis29.add(new GeoPoint(40.013529, 116.498303));
		lis29.add(new GeoPoint(40.008556, 116.490434));
		lis29.add(new GeoPoint(40.001758, 116.495321));
		lis29.add(new GeoPoint(39.995014, 116.494602));
		hasMap.put("四区	酒仙桥", lis29);

		// 四区==北苑（详）
		ArrayList<GeoPoint> lis30 = new ArrayList<GeoPoint>();
		lis30.add(new GeoPoint(40.08742, 116.488027));
		lis30.add(new GeoPoint(40.087752, 116.474804));
		lis30.add(new GeoPoint(40.083846, 116.465713));
		lis30.add(new GeoPoint(40.067725, 116.460539));
		lis30.add(new GeoPoint(40.066068, 116.432871));
		lis30.add(new GeoPoint(40.076669, 116.437255));
		lis30.add(new GeoPoint(40.080368, 116.41936));
		lis30.add(new GeoPoint(40.085833, 116.420223));
		lis30.add(new GeoPoint(40.087324, 116.413198));
		lis30.add(new GeoPoint(40.079375, 116.408742));
		lis30.add(new GeoPoint(40.06397, 116.405437));
		lis30.add(new GeoPoint(40.051213, 116.404718));
		lis30.add(new GeoPoint(40.041603, 116.405149));
		lis30.add(new GeoPoint(40.039338, 116.407449));
		lis30.add(new GeoPoint(40.039227, 116.416863));
		lis30.add(new GeoPoint(40.022985, 116.414348));
		lis30.add(new GeoPoint(40.02188, 116.423187));
		lis30.add(new GeoPoint(40.022764, 116.446543));
		lis30.add(new GeoPoint(40.022211, 116.462353));
		lis30.add(new GeoPoint(40.020222, 116.489374));
		lis30.add(new GeoPoint(40.020222, 116.495123));
		lis30.add(new GeoPoint(40.021217, 116.494333));
		lis30.add(new GeoPoint(40.046933, 116.486643));
		lis30.add(new GeoPoint(40.045897, 116.466899));
		lis30.add(new GeoPoint(40.053519, 116.466755));
		lis30.add(new GeoPoint(40.05617, 116.485799));
		lis30.add(new GeoPoint(40.049653, 116.484793));
		lis30.add(new GeoPoint(40.05247, 116.488889));
		hasMap.put("四区	北苑", lis30);

		// 四区==奥运局（详）
		ArrayList<GeoPoint> lis31 = new ArrayList<GeoPoint>();
		lis31.add(new GeoPoint(40.039227, 116.416863));
		lis31.add(new GeoPoint(40.039338, 116.407449));
		lis31.add(new GeoPoint(40.041603, 116.405149));
		lis31.add(new GeoPoint(40.039552, 116.402095));
		lis31.add(new GeoPoint(40.029028, 116.395663));
		lis31.add(new GeoPoint(40.01632, 116.399041));
		lis31.add(new GeoPoint(40.016209, 116.392717));
		lis31.add(new GeoPoint(39.994337, 116.393902));
		lis31.add(new GeoPoint(39.994393, 116.400101));
		lis31.add(new GeoPoint(39.983378, 116.40055));
		lis31.add(new GeoPoint(39.983516, 116.413809));
		lis31.add(new GeoPoint(39.994849, 116.413665));
		lis31.add(new GeoPoint(39.994849, 116.407485));
		lis31.add(new GeoPoint(40.016182, 116.40655));
		lis31.add(new GeoPoint(40.016016, 116.414384));
		lis31.add(new GeoPoint(40.022985, 116.414348));
		hasMap.put("四区	奥运局", lis31);

		// 四区==南沙滩局(详)
		ArrayList<GeoPoint> lis32 = new ArrayList<GeoPoint>();
		lis32.add(new GeoPoint(40.016016, 116.414384));
		lis32.add(new GeoPoint(40.016182, 116.40655));
		lis32.add(new GeoPoint(40.010517, 116.406838));
		lis32.add(new GeoPoint(40.011485, 116.408994));
		lis32.add(new GeoPoint(40.011982, 116.414204));
		hasMap.put("四区	南沙滩局", lis32);

		// 四区==望京局（详）
		ArrayList<GeoPoint> lis33 = new ArrayList<GeoPoint>();
		lis33.add(new GeoPoint(39.977656, 116.475846));
		lis33.add(new GeoPoint(39.995014, 116.494602));
		lis33.add(new GeoPoint(40.001758, 116.495321));
		lis33.add(new GeoPoint(40.008556, 116.490434));
		lis33.add(new GeoPoint(40.013529, 116.498303));
		lis33.add(new GeoPoint(40.011319, 116.506496));
		lis33.add(new GeoPoint(40.020222, 116.495123));
		lis33.add(new GeoPoint(40.020222, 116.489374));
		lis33.add(new GeoPoint(40.022211, 116.462353));
		lis33.add(new GeoPoint(40.007851, 116.457862));
		lis33.add(new GeoPoint(39.993536, 116.449346));
		lis33.add(new GeoPoint(39.986736, 116.461491));
		hasMap.put("四区	望京局", lis33);

		// 四区==芍药居（详）
		ArrayList<GeoPoint> lis34 = new ArrayList<GeoPoint>();
		lis34.add(new GeoPoint(40.004867, 116.430877));
		lis34.add(new GeoPoint(39.983226, 116.431056));
		lis34.add(new GeoPoint(39.982065, 116.448519));
		lis34.add(new GeoPoint(39.975264, 116.451106));
		lis34.add(new GeoPoint(39.967578, 116.463611));
		lis34.add(new GeoPoint(39.975278, 116.472827));
		lis34.add(new GeoPoint(39.977656, 116.475846));
		lis34.add(new GeoPoint(39.986736, 116.461491));
		lis34.add(new GeoPoint(39.993536, 116.449346));
		lis34.add(new GeoPoint(40.007851, 116.457862));
		lis34.add(new GeoPoint(40.006801, 116.449813));
		lis34.add(new GeoPoint(40.008404, 116.444854));
		lis34.add(new GeoPoint(40.004176, 116.443884));
		hasMap.put("四区	芍药居", lis34);

		// 四区==安慧局（详）
		ArrayList<GeoPoint> lis35 = new ArrayList<GeoPoint>();
		lis35.add(new GeoPoint(40.016016, 116.414384));
		lis35.add(new GeoPoint(40.011982, 116.414204));
		lis35.add(new GeoPoint(40.011485, 116.408994));
		lis35.add(new GeoPoint(40.010517, 116.406838));
		lis35.add(new GeoPoint(39.994849, 116.407485));
		lis35.add(new GeoPoint(39.994849, 116.413665));
		lis35.add(new GeoPoint(39.983516, 116.413809));
		lis35.add(new GeoPoint(39.989583, 116.430625));
		lis35.add(new GeoPoint(39.983226, 116.431056));
		lis35.add(new GeoPoint(40.004867, 116.430877));
		lis35.add(new GeoPoint(40.004176, 116.443884));
		lis35.add(new GeoPoint(40.008404, 116.444854));
		lis35.add(new GeoPoint(40.006801, 116.449813));
		lis35.add(new GeoPoint(40.007851, 116.457862));
		lis35.add(new GeoPoint(40.022211, 116.462353));
		lis35.add(new GeoPoint(40.022764, 116.446543));
		lis35.add(new GeoPoint(40.02188, 116.423187));
		lis35.add(new GeoPoint(40.022985, 116.414348));
		hasMap.put("四区	安慧局", lis35);

		// 四区==五路居局（详）
		ArrayList<GeoPoint> lis36 = new ArrayList<GeoPoint>();
		lis36.add(new GeoPoint(39.983378, 116.40055));
		lis36.add(new GeoPoint(39.97496, 116.400478));
		lis36.add(new GeoPoint(39.975707, 116.431344));
		lis36.add(new GeoPoint(39.983226, 116.431056));
		lis36.add(new GeoPoint(39.989583, 116.430625));
		lis36.add(new GeoPoint(39.983516, 116.413809));
		hasMap.put("四区	五路居局", lis36);

		// 四区==和平里（详）
		ArrayList<GeoPoint> lis37 = new ArrayList<GeoPoint>();
		lis37.add(new GeoPoint(39.97496, 116.400478));
		lis37.add(new GeoPoint(39.955605, 116.400155));
		lis37.add(new GeoPoint(39.95555, 116.422936));
		lis37.add(new GeoPoint(39.954942, 116.43968));
		lis37.add(new GeoPoint(39.975264, 116.451106));
		lis37.add(new GeoPoint(39.982065, 116.448519));
		lis37.add(new GeoPoint(39.983226, 116.431056));
		lis37.add(new GeoPoint(39.975707, 116.431344));
		hasMap.put("四区	和平里", lis37);

		// 四区==左家庄局
		ArrayList<GeoPoint> lis38 = new ArrayList<GeoPoint>();
		lis38.add(new GeoPoint(39.975278, 116.472827));
		lis38.add(new GeoPoint(39.967578, 116.463611));
		lis38.add(new GeoPoint(39.975264, 116.451106));
		lis38.add(new GeoPoint(39.954942, 116.43968));
		lis38.add(new GeoPoint(39.947253, 116.440327));
		lis38.add(new GeoPoint(39.940062, 116.440614));
		lis38.add(new GeoPoint(39.947018, 116.466467));
		lis38.add(new GeoPoint(39.949452, 116.465389));
		lis38.add(new GeoPoint(39.950171, 116.462012));
		lis38.add(new GeoPoint(39.952715, 116.462084));
		lis38.add(new GeoPoint(39.954997, 116.468408));
		lis38.add(new GeoPoint(39.95331, 116.468264));
		lis38.add(new GeoPoint(39.959795, 116.482601));
		lis38.add(new GeoPoint(39.969638, 116.476421));
		hasMap.put("四区	左家庄局", lis38);

		// 四区==使馆局
		ArrayList<GeoPoint> lis39 = new ArrayList<GeoPoint>();
		lis39.add(new GeoPoint(39.952715, 116.462084));
		lis39.add(new GeoPoint(39.950171, 116.462012));
		lis39.add(new GeoPoint(39.949452, 116.465389));
		lis39.add(new GeoPoint(39.947018, 116.466467));
		lis39.add(new GeoPoint(39.975278, 116.472827));
		lis39.add(new GeoPoint(39.95331, 116.468264));
		lis39.add(new GeoPoint(39.954997, 116.468408));
		hasMap.put("四区	使馆局", lis39);

		// 四区==东皇城根局
		ArrayList<GeoPoint> lis40 = new ArrayList<GeoPoint>();
		lis40.add(new GeoPoint(39.954887, 116.379097));
		lis40.add(new GeoPoint(39.945152, 116.400369));
		lis40.add(new GeoPoint(39.941833, 116.397566));
		lis40.add(new GeoPoint(39.938957, 116.391026));
		lis40.add(new GeoPoint(39.928888, 116.393398));
		lis40.add(new GeoPoint(39.940119, 116.403531));
		lis40.add(new GeoPoint(39.930602, 116.440686));
		lis40.add(new GeoPoint(39.940062, 116.440614));
		lis40.add(new GeoPoint(39.947253, 116.440327));
		lis40.add(new GeoPoint(39.954942, 116.43968));
		lis40.add(new GeoPoint(39.95555, 116.422936));
		lis40.add(new GeoPoint(39.955605, 116.400155));
		hasMap.put("四区	东皇城根局", lis40);

		// 四区==机场局
		ArrayList<GeoPoint> lis41 = new ArrayList<GeoPoint>();
		lis41.add(new GeoPoint(40.064122, 116.551555));
		lis41.add(new GeoPoint(40.072501, 116.560538));
		lis41.add(new GeoPoint(40.068194, 116.5766));
		lis41.add(new GeoPoint(40.076918, 116.574516));
		lis41.add(new GeoPoint(40.081086, 116.579151));
		lis41.add(new GeoPoint(40.10551, 116.580229));
		lis41.add(new GeoPoint(40.089615, 116.585691));
		lis41.add(new GeoPoint(40.100874, 116.610699));
		lis41.add(new GeoPoint(40.054389, 116.605669));
		lis41.add(new GeoPoint(40.048755, 116.622773));
		lis41.add(new GeoPoint(40.037819, 116.609118));
		lis41.add(new GeoPoint(40.022557, 116.603225));
		lis41.add(new GeoPoint(40.038247, 116.577714));
		lis41.add(new GeoPoint(40.043135, 116.573545));
		lis41.add(new GeoPoint(40.055728, 116.552274));
		hasMap.put("四区	机场局", lis41);

		// 五区==神路街
		ArrayList<GeoPoint> lis42 = new ArrayList<GeoPoint>();
		lis42.add(new GeoPoint(39.940062, 116.440614));
		lis42.add(new GeoPoint(39.930602, 116.440686));
		lis42.add(new GeoPoint(39.919279, 116.441746));
		lis42.add(new GeoPoint(39.919279, 116.456838));
		lis42.add(new GeoPoint(39.932614, 116.456838));
		lis42.add(new GeoPoint(39.932946, 116.450298));
		lis42.add(new GeoPoint(39.936874, 116.450226));
		lis42.add(new GeoPoint(39.937206, 116.446274));
		lis42.add(new GeoPoint(39.939696, 116.445914));
		hasMap.put("五区	神路街", lis42);

		// 五区==呼家楼
		ArrayList<GeoPoint> lis43 = new ArrayList<GeoPoint>();
		lis43.add(new GeoPoint(39.939696, 116.445914));
		lis43.add(new GeoPoint(39.937206, 116.446274));
		lis43.add(new GeoPoint(39.936874, 116.450226));
		lis43.add(new GeoPoint(39.932946, 116.450298));
		lis43.add(new GeoPoint(39.932614, 116.456838));
		lis43.add(new GeoPoint(39.919279, 116.456838));
		lis43.add(new GeoPoint(39.919279, 116.441746));
		lis43.add(new GeoPoint(39.914741, 116.441962));
		lis43.add(new GeoPoint(39.914575, 116.495788));
		lis43.add(new GeoPoint(39.926805, 116.496435));
		lis43.add(new GeoPoint(39.951222, 116.496363));
		lis43.add(new GeoPoint(39.964012, 116.49392));
		lis43.add(new GeoPoint(39.959795, 116.482601));
		lis43.add(new GeoPoint(39.95331, 116.468264));
		lis43.add(new GeoPoint(39.975278, 116.472827));
		lis43.add(new GeoPoint(39.947018, 116.466467));
		hasMap.put("五区	呼家楼", lis43);

		ArrayList<GeoPoint> lis44 = new ArrayList<GeoPoint>();
		lis44.add(new GeoPoint(39.953669, 116.515623));
		lis44.add(new GeoPoint(39.959795, 116.482601));
		lis44.add(new GeoPoint(39.955426, 116.501034));
		lis44.add(new GeoPoint(39.951499, 116.501681));
		lis44.add(new GeoPoint(39.951222, 116.496363));
		lis44.add(new GeoPoint(39.926805, 116.496435));
		lis44.add(new GeoPoint(39.927358, 116.515443));
		lis44.add(new GeoPoint(39.932337, 116.515731));
		lis44.add(new GeoPoint(39.930124, 116.549327));
		lis44.add(new GeoPoint(39.947723, 116.548321));
		lis44.add(new GeoPoint(39.965035, 116.535242));
		lis44.add(new GeoPoint(39.956684, 116.523384));
		hasMap.put("五区	青年路局", lis44);

		// 五区==高碑店
		ArrayList<GeoPoint> lis45 = new ArrayList<GeoPoint>();
		lis45.add(new GeoPoint(39.926805, 116.496435));
		lis45.add(new GeoPoint(39.914575, 116.495788));
		lis45.add(new GeoPoint(39.911642, 116.496219));
		lis45.add(new GeoPoint(39.913164, 116.523887));
		lis45.add(new GeoPoint(39.906827, 116.526259));
		lis45.add(new GeoPoint(39.897279, 116.560107));
		lis45.add(new GeoPoint(39.915959, 116.550621));
		lis45.add(new GeoPoint(39.930124, 116.549327));
		lis45.add(new GeoPoint(39.932337, 116.515731));
		lis45.add(new GeoPoint(39.927358, 116.515443));
		hasMap.put("五区	高碑店局", lis45);

		// 五区==定福庄局
		ArrayList<GeoPoint> lis46 = new ArrayList<GeoPoint>();
		lis46.add(new GeoPoint(39.965035, 116.535242));
		lis46.add(new GeoPoint(39.947723, 116.548321));
		lis46.add(new GeoPoint(39.930124, 116.549327));
		lis46.add(new GeoPoint(39.915959, 116.550621));
		lis46.add(new GeoPoint(39.897279, 116.560107));
		lis46.add(new GeoPoint(39.896283, 116.554286));
		lis46.add(new GeoPoint(39.897279, 116.560107));
		lis46.add(new GeoPoint(39.840378, 116.575701));
		lis46.add(new GeoPoint(39.833812, 116.582744));
		lis46.add(new GeoPoint(39.829906, 116.590146));
		lis46.add(new GeoPoint(39.834449, 116.594314));
		lis46.add(new GeoPoint(39.828576, 116.606388));
		lis46.add(new GeoPoint(39.844422, 116.604663));
		lis46.add(new GeoPoint(39.86403, 116.629672));
		lis46.add(new GeoPoint(39.86691, 116.632977));
		lis46.add(new GeoPoint(39.873444, 116.627659));
		lis46.add(new GeoPoint(39.877542, 116.629384));
		lis46.add(new GeoPoint(39.896144, 116.631899));
		lis46.add(new GeoPoint(39.896006, 116.625539));
		lis46.add(new GeoPoint(39.914354, 116.626545));
		lis46.add(new GeoPoint(39.907602, 116.629959));
		lis46.add(new GeoPoint(39.914354, 116.626545));
		lis46.add(new GeoPoint(39.930373, 116.63154));
		lis46.add(new GeoPoint(39.929543, 116.63887));
		lis46.add(new GeoPoint(39.93314, 116.633948));
		lis46.add(new GeoPoint(39.957493, 116.637289));
		lis46.add(new GeoPoint(39.963134, 116.634415));
		lis46.add(new GeoPoint(39.978174, 116.615011));
		lis46.add(new GeoPoint(39.977289, 116.605813));
		lis46.add(new GeoPoint(39.971428, 116.595895));
		lis46.add(new GeoPoint(39.97165, 116.589787));
		lis46.add(new GeoPoint(39.97082, 116.580876));
		lis46.add(new GeoPoint(39.9727, 116.572036));
		lis46.add(new GeoPoint(39.975465, 116.564059));
		lis46.add(new GeoPoint(39.977842, 116.546093));
		hasMap.put("五区	定福庄局", lis46);

		// 五区==东单局
		ArrayList<GeoPoint> lis47 = new ArrayList<GeoPoint>();
		lis47.add(new GeoPoint(39.928727, 116.39719));
		lis47.add(new GeoPoint(39.919653, 116.398484));
		lis47.add(new GeoPoint(39.919653, 116.401789));
		lis47.add(new GeoPoint(39.91434, 116.402364));
		lis47.add(new GeoPoint(39.914008, 116.405814));
		lis47.add(new GeoPoint(39.906979, 116.406101));
		lis47.add(new GeoPoint(39.907533, 116.424714));
		lis47.add(new GeoPoint(39.906924, 116.443183));
		lis47.add(new GeoPoint(39.914741, 116.441962));
		lis47.add(new GeoPoint(39.919279, 116.441746));
		lis47.add(new GeoPoint(39.930602, 116.440686));
		lis47.add(new GeoPoint(39.940119, 116.403531));
		hasMap.put("五区	东单局", lis47);

		// 七区==金鱼池
		ArrayList<GeoPoint> lis48 = new ArrayList<GeoPoint>();
		lis48.add(new GeoPoint(39.906979, 116.406101));
		lis48.add(new GeoPoint(39.892864, 116.40488));
		lis48.add(new GeoPoint(39.878691, 116.405814));
		lis48.add(new GeoPoint(39.879466, 116.427589));
		lis48.add(new GeoPoint(39.887204, 116.427553));
		lis48.add(new GeoPoint(39.893418, 116.425864));
		lis48.add(new GeoPoint(39.907533, 116.424714));
		hasMap.put("七区	金鱼池", lis48);

		// 七区==幸福大街
		ArrayList<GeoPoint> lis49 = new ArrayList<GeoPoint>();
		lis49.add(new GeoPoint(39.907533, 116.424714));
		lis49.add(new GeoPoint(39.893418, 116.425864));
		lis49.add(new GeoPoint(39.887204, 116.427553));
		lis49.add(new GeoPoint(39.879466, 116.427589));
		lis49.add(new GeoPoint(39.877805, 116.45001));
		lis49.add(new GeoPoint(39.884491, 116.452669));
		lis49.add(new GeoPoint(39.902012, 116.450693));
		lis49.add(new GeoPoint(39.906924, 116.443183));
		hasMap.put("七区	幸福大街", lis49);

		// 七区==双井
		ArrayList<GeoPoint> lis50 = new ArrayList<GeoPoint>();
		lis50.add(new GeoPoint(39.906924, 116.443183));
		lis50.add(new GeoPoint(39.902012, 116.450693));
		lis50.add(new GeoPoint(39.884491, 116.452669));
		lis50.add(new GeoPoint(39.877805, 116.45001));
		lis50.add(new GeoPoint(39.877237, 116.467905));
		lis50.add(new GeoPoint(39.890082, 116.467905));
		lis50.add(new GeoPoint(39.890138, 116.496219));
		lis50.add(new GeoPoint(39.8882, 116.498232));
		lis50.add(new GeoPoint(39.895563, 116.523959));
		lis50.add(new GeoPoint(39.889252, 116.524246));
		lis50.add(new GeoPoint(39.887037, 116.544872));
		lis50.add(new GeoPoint(39.896117, 116.54365));
		lis50.add(new GeoPoint(39.896283, 116.554286));
		lis50.add(new GeoPoint(39.897279, 116.560107));
		lis50.add(new GeoPoint(39.906827, 116.526259));
		lis50.add(new GeoPoint(39.913164, 116.523887));
		lis50.add(new GeoPoint(39.911642, 116.496219));
		lis50.add(new GeoPoint(39.910037, 116.468192));
		hasMap.put("七区	双井", lis50);

		// 七区==华威
		ArrayList<GeoPoint> lis51 = new ArrayList<GeoPoint>();
		lis51.add(new GeoPoint(39.890082, 116.467905));
		lis51.add(new GeoPoint(39.877237, 116.467905));
		lis51.add(new GeoPoint(39.869706, 116.46309));
		lis51.add(new GeoPoint(39.840239, 116.493273));
		lis51.add(new GeoPoint(39.826277, 116.511383));
		lis51.add(new GeoPoint(39.837414, 116.509155));
		lis51.add(new GeoPoint(39.840239, 116.493273));
		lis51.add(new GeoPoint(39.837414, 116.509155));
		lis51.add(new GeoPoint(39.867768, 116.493632));
		lis51.add(new GeoPoint(39.877348, 116.502328));
		lis51.add(new GeoPoint(39.882719, 116.50849));
		lis51.add(new GeoPoint(39.888864, 116.499363));
		lis51.add(new GeoPoint(39.890138, 116.496219));
		hasMap.put("七区	华威", lis51);

		// 七区==垡头
		ArrayList<GeoPoint> lis52 = new ArrayList<GeoPoint>();
		lis52.add(new GeoPoint(39.888864, 116.499363));
		lis52.add(new GeoPoint(39.882719, 116.50849));
		lis52.add(new GeoPoint(39.877348, 116.502328));
		lis52.add(new GeoPoint(39.867768, 116.493632));
		lis52.add(new GeoPoint(39.837414, 116.509155));
		lis52.add(new GeoPoint(39.840239, 116.493273));
		lis52.add(new GeoPoint(39.837414, 116.509155));
		lis52.add(new GeoPoint(39.826277, 116.511383));
		lis52.add(new GeoPoint(39.807877, 116.534236));
		lis52.add(new GeoPoint(39.82388, 116.541278));
		lis52.add(new GeoPoint(39.837012, 116.539625));
		lis52.add(new GeoPoint(39.839339, 116.533301));
		lis52.add(new GeoPoint(39.840378, 116.575701));
		lis52.add(new GeoPoint(39.840516, 116.575612));
		lis52.add(new GeoPoint(39.86151, 116.574821));
		lis52.add(new GeoPoint(39.897279, 116.560107));
		lis52.add(new GeoPoint(39.896117, 116.54365));
		lis52.add(new GeoPoint(39.887037, 116.544872));
		lis52.add(new GeoPoint(39.889252, 116.524246));
		lis52.add(new GeoPoint(39.895563, 116.523959));
		hasMap.put("七区	垡头", lis52);

		// 七区==方庄
		ArrayList<GeoPoint> lis53 = new ArrayList<GeoPoint>();
		lis53.add(new GeoPoint(39.853839, 116.428146));
		lis53.add(new GeoPoint(39.860929, 116.42078));
		lis53.add(new GeoPoint(39.852703, 116.428793));
		lis53.add(new GeoPoint(39.841292, 116.428667));
		lis53.add(new GeoPoint(39.838522, 116.42881));
		lis53.add(new GeoPoint(39.836416, 116.446399));
		lis53.add(new GeoPoint(39.832538, 116.452957));
		lis53.add(new GeoPoint(39.830543, 116.458562));
		lis53.add(new GeoPoint(39.823617, 116.46733));
		lis53.add(new GeoPoint(39.817742, 116.470636));
		lis53.add(new GeoPoint(39.812034, 116.468623));
		lis53.add(new GeoPoint(39.826277, 116.511383));
		lis53.add(new GeoPoint(39.840239, 116.493273));
		lis53.add(new GeoPoint(39.869706, 116.46309));
		lis53.add(new GeoPoint(39.877237, 116.467905));
		lis53.add(new GeoPoint(39.877805, 116.45001));
		lis53.add(new GeoPoint(39.879466, 116.427589));
		hasMap.put("七区	方庄", lis53);

		// 七区==马家堡
		ArrayList<GeoPoint> lis54 = new ArrayList<GeoPoint>();
		lis54.add(new GeoPoint(39.863455, 116.39322));
		lis54.add(new GeoPoint(39.863234, 116.377697));
		lis54.add(new GeoPoint(39.85548, 116.353191));
		lis54.add(new GeoPoint(39.85548, 116.353191));
		lis54.add(new GeoPoint(39.823069, 116.351538));
		lis54.add(new GeoPoint(39.832545, 116.374391));
		lis54.add(new GeoPoint(39.83659, 116.393435));
		lis54.add(new GeoPoint(39.846506, 116.393004));
		lis54.add(new GeoPoint(39.851713, 116.392717));
		hasMap.put("七区	马家堡", lis54);

		// 七区==木欘园
		ArrayList<GeoPoint> lis55 = new ArrayList<GeoPoint>();
		lis55.add(new GeoPoint(39.878691, 116.405814));
		lis55.add(new GeoPoint(39.878352, 116.394298));
		lis55.add(new GeoPoint(39.869104, 116.385315));
		lis55.add(new GeoPoint(39.863234, 116.377697));
		lis55.add(new GeoPoint(39.863455, 116.39322));
		lis55.add(new GeoPoint(39.851713, 116.392717));
		lis55.add(new GeoPoint(39.846506, 116.393004));
		lis55.add(new GeoPoint(39.83659, 116.393363));
		lis55.add(new GeoPoint(39.838529, 116.400694));
		lis55.add(new GeoPoint(39.835862, 116.421983));
		lis55.add(new GeoPoint(39.831818, 116.428236));
		lis55.add(new GeoPoint(39.83127, 116.437847));
		lis55.add(new GeoPoint(39.834477, 116.441459));
		lis55.add(new GeoPoint(39.830654, 116.447423));
		lis55.add(new GeoPoint(39.832538, 116.452957));
		lis55.add(new GeoPoint(39.836416, 116.446399));
		lis55.add(new GeoPoint(39.838522, 116.42881));
		lis55.add(new GeoPoint(39.841292, 116.428667));
		lis55.add(new GeoPoint(39.852703, 116.428793));
		lis55.add(new GeoPoint(39.860929, 116.42078));
		lis55.add(new GeoPoint(39.853839, 116.428146));
		hasMap.put("七区	木樨园", lis55);

		// 七区==南苑
		ArrayList<GeoPoint> lis56 = new ArrayList<GeoPoint>();
		lis56.add(new GeoPoint(39.838529, 116.400694));
		lis56.add(new GeoPoint(39.83659, 116.393363));
		lis56.add(new GeoPoint(39.832545, 116.374391));
		lis56.add(new GeoPoint(39.823069, 116.351538));
		lis56.add(new GeoPoint(39.813953, 116.351969));
		lis56.add(new GeoPoint(39.812567, 116.366235));
		lis56.add(new GeoPoint(39.806554, 116.361024));
		lis56.add(new GeoPoint(39.792917, 116.36318));
		lis56.add(new GeoPoint(39.787927, 116.385315));
		lis56.add(new GeoPoint(39.774203, 116.407089));
		lis56.add(new GeoPoint(39.7729, 116.418552));
		lis56.add(new GeoPoint(39.772789, 116.423439));
		lis56.add(new GeoPoint(39.777052, 116.480409));
		lis56.add(new GeoPoint(39.782431, 116.478828));
		lis56.add(new GeoPoint(39.794074, 116.472217));
		lis56.add(new GeoPoint(39.803221, 116.474588));
		lis56.add(new GeoPoint(39.807877, 116.473151));
		lis56.add(new GeoPoint(39.812034, 116.468623));
		lis56.add(new GeoPoint(39.817742, 116.470636));
		lis56.add(new GeoPoint(39.823617, 116.46733));
		lis56.add(new GeoPoint(39.830543, 116.458562));
		lis56.add(new GeoPoint(39.832538, 116.452957));
		lis56.add(new GeoPoint(39.830654, 116.447423));
		lis56.add(new GeoPoint(39.834477, 116.441459));
		lis56.add(new GeoPoint(39.831818, 116.428236));
		lis56.add(new GeoPoint(39.835862, 116.421983));
		hasMap.put("七区	南苑", lis56);

		// 七区==亦庄
		ArrayList<GeoPoint> lis57 = new ArrayList<GeoPoint>();
		lis57.add(new GeoPoint(39.812034, 116.468623));
		lis57.add(new GeoPoint(39.807877, 116.473151));
		lis57.add(new GeoPoint(39.803221, 116.474588));
		lis57.add(new GeoPoint(39.794074, 116.472217));
		lis57.add(new GeoPoint(39.782431, 116.478828));
		lis57.add(new GeoPoint(39.777052, 116.480409));
		lis57.add(new GeoPoint(39.772117, 116.483931));
		lis57.add(new GeoPoint(39.767347, 116.498519));
		lis57.add(new GeoPoint(39.758917, 116.52784));
		lis57.add(new GeoPoint(39.767292, 116.546524));
		lis57.add(new GeoPoint(39.774612, 116.563484));
		lis57.add(new GeoPoint(39.783762, 116.555867));
		lis57.add(new GeoPoint(39.78986, 116.54904));
		lis57.add(new GeoPoint(39.796624, 116.564347));
		lis57.add(new GeoPoint(39.82388, 116.541278));
		lis57.add(new GeoPoint(39.807877, 116.534236));
		lis57.add(new GeoPoint(39.826277, 116.511383));
		hasMap.put("七区	亦庄", lis57);

		// 通州==次渠分局
		ArrayList<GeoPoint> lis58 = new ArrayList<GeoPoint>();
		lis58.add(new GeoPoint(39.86691, 116.632977));
		lis58.add(new GeoPoint(39.86403, 116.629672));
		lis58.add(new GeoPoint(39.844422, 116.604663));
		lis58.add(new GeoPoint(39.828576, 116.606388));
		lis58.add(new GeoPoint(39.829906, 116.590146));
		lis58.add(new GeoPoint(39.834449, 116.594314));
		lis58.add(new GeoPoint(39.833812, 116.582744));
		lis58.add(new GeoPoint(39.839962, 116.555921));
		lis58.add(new GeoPoint(39.840378, 116.575701));
		lis58.add(new GeoPoint(39.839339, 116.533301));
		lis58.add(new GeoPoint(39.837012, 116.539625));
		lis58.add(new GeoPoint(39.82388, 116.541278));
		lis58.add(new GeoPoint(39.796624, 116.564347));
		lis58.add(new GeoPoint(39.78986, 116.54904));
		lis58.add(new GeoPoint(39.783762, 116.555867));
		lis58.add(new GeoPoint(39.774612, 116.563484));
		lis58.add(new GeoPoint(39.767292, 116.546524));
		lis58.add(new GeoPoint(39.754957, 116.546039));
		lis58.add(new GeoPoint(39.752406, 116.562281));
		lis58.add(new GeoPoint(39.758951, 116.620203));
		lis58.add(new GeoPoint(39.770598, 116.676401));
		lis58.add(new GeoPoint(39.808632, 116.669934));
		lis58.add(new GeoPoint(39.840883, 116.749128));
		lis58.add(new GeoPoint(39.848971, 116.72067));
		hasMap.put("通州	次渠分局", lis58);

		// 通话梨园分局
		ArrayList<GeoPoint> lis59 = new ArrayList<GeoPoint>();
		lis59.add(new GeoPoint(39.914354, 116.626545));
		lis59.add(new GeoPoint(39.896006, 116.625539));
		lis59.add(new GeoPoint(39.896144, 116.631899));
		lis59.add(new GeoPoint(39.877542, 116.629384));
		lis59.add(new GeoPoint(39.873444, 116.627659));
		lis59.add(new GeoPoint(39.86691, 116.632977));
		lis59.add(new GeoPoint(39.848971, 116.72067));
		lis59.add(new GeoPoint(39.840883, 116.749128));
		lis59.add(new GeoPoint(39.88674, 116.668784));
		lis59.add(new GeoPoint(39.896705, 116.674533));
		lis59.add(new GeoPoint(39.898753, 116.656423));
		hasMap.put("通州	梨园分局", lis59);

		// 通州==通镇 分局
		ArrayList<GeoPoint> lis60 = new ArrayList<GeoPoint>();
		lis60.add(new GeoPoint(39.952626, 116.651518));
		lis60.add(new GeoPoint(39.957493, 116.637289));
		lis60.add(new GeoPoint(39.93314, 116.633948));
		lis60.add(new GeoPoint(39.929543, 116.63887));
		lis60.add(new GeoPoint(39.930373, 116.63154));
		lis60.add(new GeoPoint(39.914354, 116.626545));
		lis60.add(new GeoPoint(39.907602, 116.629959));
		lis60.add(new GeoPoint(39.914354, 116.626545));
		lis60.add(new GeoPoint(39.898753, 116.656423));
		lis60.add(new GeoPoint(39.914416, 116.675252));
		lis60.add(new GeoPoint(39.924709, 116.67209));
		lis60.add(new GeoPoint(39.936238, 116.657303));
		lis60.add(new GeoPoint(39.936736, 116.655291));
		lis60.add(new GeoPoint(39.945366, 116.649973));
		hasMap.put("通州	通镇分局", lis60);

		// 大兴==团河分局
		ArrayList<GeoPoint> lis61 = new ArrayList<GeoPoint>();
		lis61.add(new GeoPoint(39.792917, 116.36318));
		lis61.add(new GeoPoint(39.78338, 116.37202));
		lis61.add(new GeoPoint(39.754541, 116.374571));
		lis61.add(new GeoPoint(39.765302, 116.362929));
		lis61.add(new GeoPoint(39.748217, 116.389519));
		lis61.add(new GeoPoint(39.758757, 116.44198));
		lis61.add(new GeoPoint(39.754874, 116.475612));
		lis61.add(new GeoPoint(39.767347, 116.498519));
		lis61.add(new GeoPoint(39.772117, 116.483931));
		lis61.add(new GeoPoint(39.777052, 116.480409));
		lis61.add(new GeoPoint(39.772789, 116.423439));
		lis61.add(new GeoPoint(39.7729, 116.418552));
		lis61.add(new GeoPoint(39.774203, 116.407089));
		lis61.add(new GeoPoint(39.787927, 116.385315));
		hasMap.put("大兴	团河分局", lis61);

		// 大兴==西红门 分局
		ArrayList<GeoPoint> lis62 = new ArrayList<GeoPoint>();
		lis62.add(new GeoPoint(39.813953, 116.351969));
		lis62.add(new GeoPoint(39.80769, 116.346903));
		lis62.add(new GeoPoint(39.8032, 116.334183));
		lis62.add(new GeoPoint(39.775035, 116.31672));
		lis62.add(new GeoPoint(39.761946, 116.31327));
		lis62.add(new GeoPoint(39.759284, 116.339142));
		lis62.add(new GeoPoint(39.748411, 116.35179));
		lis62.add(new GeoPoint(39.752156, 116.351215));
		lis62.add(new GeoPoint(39.754541, 116.374571));
		lis62.add(new GeoPoint(39.78338, 116.37202));
		lis62.add(new GeoPoint(39.792917, 116.36318));
		lis62.add(new GeoPoint(39.805916, 116.373924));
		lis62.add(new GeoPoint(39.806554, 116.361024));
		lis62.add(new GeoPoint(39.812567, 116.366235));
		hasMap.put("大兴	西红门分局", lis62);

		// 大兴==黄村分局
		ArrayList<GeoPoint> lis63 = new ArrayList<GeoPoint>();
		lis63.add(new GeoPoint(39.805667, 116.291352));
		lis63.add(new GeoPoint(39.802757, 116.258797));
		lis63.add(new GeoPoint(39.775589, 116.259911));
		lis63.add(new GeoPoint(39.758396, 116.259049));
		lis63.add(new GeoPoint(39.755845, 116.285495));
		lis63.add(new GeoPoint(39.761946, 116.31327));
		lis63.add(new GeoPoint(39.775035, 116.31672));
		hasMap.put("大兴	黄村分局", lis63);

		// 怀柔==桥梓分局
		ArrayList<GeoPoint> lis64 = new ArrayList<GeoPoint>();
		lis64.add(new GeoPoint(40.460303, 116.412336));
		lis64.add(new GeoPoint(40.401321, 116.269757));
		lis64.add(new GeoPoint(40.374943, 116.359731));
		lis64.add(new GeoPoint(40.343496, 116.368067));
		lis64.add(new GeoPoint(40.337337, 116.436769));
		lis64.add(new GeoPoint(40.289364, 116.43332));
		lis64.add(new GeoPoint(40.264263, 116.498285));
		lis64.add(new GeoPoint(40.285401, 116.556064));
		lis64.add(new GeoPoint(40.263823, 116.62218));
		lis64.add(new GeoPoint(40.274173, 116.632384));
		lis64.add(new GeoPoint(40.277475, 116.675072));
		lis64.add(new GeoPoint(40.299489, 116.668173));
		lis64.add(new GeoPoint(40.30059, 116.650351));
		lis64.add(new GeoPoint(40.303891, 116.650351));
		lis64.add(new GeoPoint(40.312915, 116.646614));
		lis64.add(new GeoPoint(40.308293, 116.630803));
		lis64.add(new GeoPoint(40.337997, 116.629941));
		lis64.add(new GeoPoint(40.348775, 116.612406));
		lis64.add(new GeoPoint(40.457559, 116.574174));
		lis64.add(new GeoPoint(40.460742, 116.582223));
		hasMap.put("怀柔	桥梓分局", lis64);

		// 怀柔==城区分局
		ArrayList<GeoPoint> lis65 = new ArrayList<GeoPoint>();
		lis65.add(new GeoPoint(40.457559, 116.574174));
		lis65.add(new GeoPoint(40.348775, 116.612406));
		lis65.add(new GeoPoint(40.337997, 116.629941));
		lis65.add(new GeoPoint(40.308293, 116.630803));
		lis65.add(new GeoPoint(40.312915, 116.646614));
		lis65.add(new GeoPoint(40.303891, 116.650351));
		lis65.add(new GeoPoint(40.311704, 116.673203));
		lis65.add(new GeoPoint(40.332057, 116.676078));
		lis65.add(new GeoPoint(40.356143, 116.653081));
		lis65.add(new GeoPoint(40.370656, 116.658112));
		lis65.add(new GeoPoint(40.39165, 116.650063));
		lis65.add(new GeoPoint(40.409342, 116.667023));
		lis65.add(new GeoPoint(40.441088, 116.63799));
		hasMap.put("怀柔	城区分局", lis65);

		// 昌平==昌平分局
		ArrayList<GeoPoint> lis66 = new ArrayList<GeoPoint>();
		lis66.add(new GeoPoint(40.349435, 116.147515));
		lis66.add(new GeoPoint(40.340025, 116.108115));
		lis66.add(new GeoPoint(40.298217, 116.155833));
		lis66.add(new GeoPoint(40.23273, 116.195431));
		lis66.add(new GeoPoint(40.214, 116.184938));
		lis66.add(new GeoPoint(40.205955, 116.190975));
		lis66.add(new GeoPoint(40.189835, 116.212247));
		lis66.add(new GeoPoint(40.18278, 116.190256));
		lis66.add(new GeoPoint(40.162713, 116.197012));
		lis66.add(new GeoPoint(40.164146, 116.223027));
		lis66.add(new GeoPoint(40.168778, 116.25321));
		lis66.add(new GeoPoint(40.177158, 116.245161));
		lis66.add(new GeoPoint(40.18278, 116.308833));
		lis66.add(new GeoPoint(40.203613, 116.303515));
		lis66.add(new GeoPoint(40.21298, 116.377248));
		lis66.add(new GeoPoint(40.233253, 116.379404));
		lis66.add(new GeoPoint(40.235346, 116.393777));
		lis66.add(new GeoPoint(40.249996, 116.389321));
		lis66.add(new GeoPoint(40.249996, 116.389321));
		lis66.add(new GeoPoint(40.315273, 116.345627));
		lis66.add(new GeoPoint(40.363888, 116.331111));
		lis66.add(new GeoPoint(40.374943, 116.359731));
		lis66.add(new GeoPoint(40.401321, 116.269757));
		lis66.add(new GeoPoint(40.381594, 116.287363));
		lis66.add(new GeoPoint(40.378406, 116.255671));
		lis66.add(new GeoPoint(40.377087, 116.201916));
		hasMap.put("昌平	昌平分局", lis66);

		// 昌平==小汤山分局
		ArrayList<GeoPoint> lis67 = new ArrayList<GeoPoint>();
		lis67.add(new GeoPoint(40.374943, 116.359731));
		lis67.add(new GeoPoint(40.363888, 116.331111));
		lis67.add(new GeoPoint(40.315273, 116.345627));
		lis67.add(new GeoPoint(40.318904, 116.307755));
		lis67.add(new GeoPoint(40.252418, 116.357485));
		lis67.add(new GeoPoint(40.235346, 116.393777));
		lis67.add(new GeoPoint(40.233253, 116.379404));
		lis67.add(new GeoPoint(40.21298, 116.377248));
		lis67.add(new GeoPoint(40.203613, 116.303515));
		lis67.add(new GeoPoint(40.176716, 116.302078));
		lis67.add(new GeoPoint(40.14661, 116.340381));
		lis67.add(new GeoPoint(40.138227, 116.349005));
		lis67.add(new GeoPoint(40.136903, 116.379188));
		lis67.add(new GeoPoint(40.139771, 116.406497));
		lis67.add(new GeoPoint(40.156096, 116.412533));
		lis67.add(new GeoPoint(40.123884, 116.497046));
		lis67.add(new GeoPoint(40.152125, 116.488709));
		lis67.add(new GeoPoint(40.182119, 116.46945));
		lis67.add(new GeoPoint(40.206368, 116.500208));
		lis67.add(new GeoPoint(40.212099, 116.474912));
		lis67.add(new GeoPoint(40.246031, 116.528379));
		lis67.add(new GeoPoint(40.264263, 116.498285));
		lis67.add(new GeoPoint(40.289364, 116.43332));
		lis67.add(new GeoPoint(40.337337, 116.436769));
		lis67.add(new GeoPoint(40.343496, 116.368067));
		hasMap.put("昌平	小汤山分局", lis67);

		ArrayList<GeoPoint> lis68 = new ArrayList<GeoPoint>();

		lis68.add(new GeoPoint(40.152125, 116.488709));
		lis68.add(new GeoPoint(40.123884, 116.497046));
		lis68.add(new GeoPoint(40.156096, 116.412533));
		lis68.add(new GeoPoint(40.139771, 116.406497));
		lis68.add(new GeoPoint(40.136903, 116.379188));
		lis68.add(new GeoPoint(40.117815, 116.364815));
		lis68.add(new GeoPoint(40.106117, 116.372002));
		lis68.add(new GeoPoint(40.102585, 116.38235));
		lis68.add(new GeoPoint(40.0953, 116.41972));
		lis68.add(new GeoPoint(40.085833, 116.420223));
		lis68.add(new GeoPoint(40.080368, 116.41936));
		lis68.add(new GeoPoint(40.076669, 116.437255));
		lis68.add(new GeoPoint(40.066068, 116.432871));
		lis68.add(new GeoPoint(40.067725, 116.460539));
		lis68.add(new GeoPoint(40.083846, 116.465713));
		lis68.add(new GeoPoint(40.087752, 116.474804));
		lis68.add(new GeoPoint(40.123884, 116.497046));
		hasMap.put("昌平	北七家分局", lis68);

		ArrayList<GeoPoint> lis69 = new ArrayList<GeoPoint>();
		lis69.add(new GeoPoint(40.0953, 116.41972));
		lis69.add(new GeoPoint(40.102585, 116.38235));
		lis69.add(new GeoPoint(40.106117, 116.372002));
		lis69.add(new GeoPoint(40.099274, 116.324571));
		lis69.add(new GeoPoint(40.116491, 116.290939));
		lis69.add(new GeoPoint(40.099053, 116.292951));
		lis69.add(new GeoPoint(40.08139, 116.29985));
		lis69.add(new GeoPoint(40.077856, 116.314223));
		lis69.add(new GeoPoint(40.076449, 116.364474));
		lis69.add(new GeoPoint(40.075676, 116.375972));
		lis69.add(new GeoPoint(40.081086, 116.388908));
		lis69.add(new GeoPoint(40.071866, 116.403281));
		lis69.add(new GeoPoint(40.067228, 116.398681));
		lis69.add(new GeoPoint(40.06397, 116.405437));
		lis69.add(new GeoPoint(40.079375, 116.408742));
		lis69.add(new GeoPoint(40.087324, 116.413198));
		lis69.add(new GeoPoint(40.085833, 116.420223));
		hasMap.put("昌平	回龙观分局", lis69);

		// 昌平==沙河分局
		ArrayList<GeoPoint> lis70 = new ArrayList<GeoPoint>();
		lis70.add(new GeoPoint(40.18278, 116.308833));
		lis70.add(new GeoPoint(40.177158, 116.245161));
		lis70.add(new GeoPoint(40.168778, 116.25321));
		lis70.add(new GeoPoint(40.164146, 116.223027));
		lis70.add(new GeoPoint(40.168171, 116.208726));
		lis70.add(new GeoPoint(40.160507, 116.207791));
		lis70.add(new GeoPoint(40.147272, 116.214619));
		lis70.add(new GeoPoint(40.148816, 116.221949));
		lis70.add(new GeoPoint(40.140433, 116.255006));
		lis70.add(new GeoPoint(40.114725, 116.246742));
		lis70.add(new GeoPoint(40.111249, 116.251844));
		lis70.add(new GeoPoint(40.112297, 116.255869));
		lis70.add(new GeoPoint(40.115222, 116.266936));
		lis70.add(new GeoPoint(40.087296, 116.285477));
		lis70.add(new GeoPoint(40.091712, 116.295969));
		lis70.add(new GeoPoint(40.099053, 116.292951));
		lis70.add(new GeoPoint(40.116491, 116.290939));
		lis70.add(new GeoPoint(40.099274, 116.324571));
		lis70.add(new GeoPoint(40.106117, 116.372002));
		lis70.add(new GeoPoint(40.117815, 116.364815));
		lis70.add(new GeoPoint(40.136903, 116.379188));
		lis70.add(new GeoPoint(40.138227, 116.349005));
		lis70.add(new GeoPoint(40.14661, 116.340381));
		lis70.add(new GeoPoint(40.176716, 116.302078));
		hasMap.put("昌平	沙河分局", lis70);

		ArrayList<GeoPoint> lis71 = new ArrayList<GeoPoint>();
		lis71.add(new GeoPoint(40.363888, 116.331111));
		lis71.add(new GeoPoint(40.274826, 116.034526));
		lis71.add(new GeoPoint(40.175559, 116.097911));
		lis71.add(new GeoPoint(40.128022, 116.075058));
		lis71.add(new GeoPoint(40.117539, 116.097623));
		lis71.add(new GeoPoint(40.132435, 116.104953));
		lis71.add(new GeoPoint(40.124822, 116.11717));
		lis71.add(new GeoPoint(40.136407, 116.183645));
		lis71.add(new GeoPoint(40.162713, 116.197012));
		lis71.add(new GeoPoint(40.18278, 116.190256));
		lis71.add(new GeoPoint(40.189835, 116.212247));
		lis71.add(new GeoPoint(40.205955, 116.190975));
		lis71.add(new GeoPoint(40.214, 116.184938));
		lis71.add(new GeoPoint(40.23273, 116.195431));
		lis71.add(new GeoPoint(40.298217, 116.155833));
		lis71.add(new GeoPoint(40.340025, 116.108115));
		lis71.add(new GeoPoint(40.300143, 116.026765));
		hasMap.put("昌平	南口分局", lis71);

		// 二区==温泉局
		ArrayList<GeoPoint> lis72 = new ArrayList<GeoPoint>();
		lis72.add(new GeoPoint(40.162713, 116.197012));
		lis72.add(new GeoPoint(40.136407, 116.183645));
		lis72.add(new GeoPoint(40.124822, 116.11717));
		lis72.add(new GeoPoint(40.132435, 116.104953));
		lis72.add(new GeoPoint(40.117539, 116.097623));
		lis72.add(new GeoPoint(40.050136, 116.075561));
		lis72.add(new GeoPoint(40.034007, 116.092952));
		lis72.add(new GeoPoint(40.036603, 116.10869));
		lis72.add(new GeoPoint(40.035057, 116.069884));
		lis72.add(new GeoPoint(40.012182, 116.232585));
		lis72.add(new GeoPoint(40.027985, 116.255509));
		lis72.add(new GeoPoint(40.051517, 116.247461));
		lis72.add(new GeoPoint(40.059801, 116.253066));
		lis72.add(new GeoPoint(40.05947, 116.270242));
		lis72.add(new GeoPoint(40.082714, 116.260396));
		lis72.add(new GeoPoint(40.08978, 116.287848));
		lis72.add(new GeoPoint(40.115222, 116.266936));
		lis72.add(new GeoPoint(40.112297, 116.255869));
		lis72.add(new GeoPoint(40.111249, 116.251844));
		lis72.add(new GeoPoint(40.114725, 116.246742));
		lis72.add(new GeoPoint(40.140433, 116.255006));
		lis72.add(new GeoPoint(40.148816, 116.221949));
		lis72.add(new GeoPoint(40.147272, 116.214619));
		lis72.add(new GeoPoint(40.160507, 116.207791));
		lis72.add(new GeoPoint(40.168171, 116.208726));
		hasMap.put("二区	温泉局", lis72);

		// 二区==上地局
		ArrayList<GeoPoint> lis73 = new ArrayList<GeoPoint>();
		lis73.add(new GeoPoint(40.08139, 116.29985));
		lis73.add(new GeoPoint(40.08978, 116.287848));
		lis73.add(new GeoPoint(40.088179, 116.271535));
		lis73.add(new GeoPoint(40.082714, 116.260396));
		lis73.add(new GeoPoint(40.05947, 116.270242));
		lis73.add(new GeoPoint(40.055604, 116.279368));
		lis73.add(new GeoPoint(40.032184, 116.304593));
		lis73.add(new GeoPoint(40.023013, 116.309623));
		lis73.add(new GeoPoint(40.025775, 116.334776));
		lis73.add(new GeoPoint(40.065213, 116.308905));
		hasMap.put("二区	上地局", lis73);

		// 二区==清河局
		ArrayList<GeoPoint> lis74 = new ArrayList<GeoPoint>();
		lis74.add(new GeoPoint(40.075096, 116.308617));
		lis74.add(new GeoPoint(40.070568, 116.306605));
		lis74.add(new GeoPoint(40.065213, 116.308905));
		lis74.add(new GeoPoint(40.025775, 116.334776));
		lis74.add(new GeoPoint(40.023897, 116.33456));
		lis74.add(new GeoPoint(40.015, 116.343328));
		lis74.add(new GeoPoint(40.015664, 116.381631));
		lis74.add(new GeoPoint(40.01632, 116.399041));
		lis74.add(new GeoPoint(40.029028, 116.395663));
		lis74.add(new GeoPoint(40.039552, 116.402095));
		lis74.add(new GeoPoint(40.051213, 116.404718));
		lis74.add(new GeoPoint(40.054002, 116.404772));
		lis74.add(new GeoPoint(40.052566, 116.386231));
		lis74.add(new GeoPoint(40.057205, 116.383931));
		lis74.add(new GeoPoint(40.052014, 116.342537));
		lis74.add(new GeoPoint(40.076642, 116.323421));
		lis74.add(new GeoPoint(40.077856, 116.314223));
		hasMap.put("二区	清河局", lis74);

		// 二区==西三旗局
		ArrayList<GeoPoint> lis75 = new ArrayList<GeoPoint>();
		lis75.add(new GeoPoint(40.076642, 116.323421));
		lis75.add(new GeoPoint(40.052014, 116.342537));
		lis75.add(new GeoPoint(40.057205, 116.383931));
		lis75.add(new GeoPoint(40.052566, 116.386231));
		lis75.add(new GeoPoint(40.054002, 116.404772));
		lis75.add(new GeoPoint(40.06397, 116.405437));
		lis75.add(new GeoPoint(40.067228, 116.398681));
		lis75.add(new GeoPoint(40.071866, 116.403281));
		lis75.add(new GeoPoint(40.081086, 116.388908));
		lis75.add(new GeoPoint(40.075676, 116.375972));
		lis75.add(new GeoPoint(40.076449, 116.364474));
		hasMap.put("二区	西三旗局", lis75);

		// 二区==二里庄局
		ArrayList<GeoPoint> lis76 = new ArrayList<GeoPoint>();
		lis76.add(new GeoPoint(40.015, 116.343328));
		lis76.add(new GeoPoint(39.992119, 116.344549));
		lis76.add(new GeoPoint(39.994337, 116.393902));
		lis76.add(new GeoPoint(40.015664, 116.381631));
		hasMap.put("二区	二里庄局", lis76);

		// 二区==北太平庄局
		ArrayList<GeoPoint> lis77 = new ArrayList<GeoPoint>();
		lis77.add(new GeoPoint(39.992119, 116.344549));
		lis77.add(new GeoPoint(39.982334, 116.360647));
		lis77.add(new GeoPoint(39.973156, 116.386949));
		lis77.add(new GeoPoint(39.954887, 116.379097));
		lis77.add(new GeoPoint(39.945152, 116.400369));
		lis77.add(new GeoPoint(39.955605, 116.400155));
		lis77.add(new GeoPoint(39.97496, 116.400478));
		lis77.add(new GeoPoint(39.983378, 116.40055));
		lis77.add(new GeoPoint(39.994393, 116.400101));
		lis77.add(new GeoPoint(39.994337, 116.393902));
		lis77.add(new GeoPoint(39.994337, 116.393902));
		hasMap.put("二区	北太平庄局", lis77);

		// 二区==皂君庙局
		ArrayList<GeoPoint> lis78 = new ArrayList<GeoPoint>();
		lis78.add(new GeoPoint(39.982334, 116.360647));
		lis78.add(new GeoPoint(39.981118, 116.331758));
		lis78.add(new GeoPoint(39.972935, 116.327733));
		lis78.add(new GeoPoint(39.949376, 116.331614));
		lis78.add(new GeoPoint(39.948491, 116.360791));
		lis78.add(new GeoPoint(39.973377, 116.351448));
		lis78.add(new GeoPoint(39.982334, 116.360647));
		hasMap.put("二区	皂君庙局", lis78);

		// 二区==西直门局
		ArrayList<GeoPoint> lis79 = new ArrayList<GeoPoint>();
		lis79.add(new GeoPoint(39.973377, 116.351448));
		lis79.add(new GeoPoint(39.948491, 116.360791));
		lis79.add(new GeoPoint(39.94661, 116.378469));
		lis79.add(new GeoPoint(39.954887, 116.379097));
		lis79.add(new GeoPoint(39.973156, 116.386949));
		hasMap.put("二区	西直门局", lis79);

		// 二区==中关村局
		ArrayList<GeoPoint> lis80 = new ArrayList<GeoPoint>();
		lis80.add(new GeoPoint(40.023013, 116.309623));
		lis80.add(new GeoPoint(40.020692, 116.293669));
		lis80.add(new GeoPoint(40.003229, 116.301143));
		lis80.add(new GeoPoint(39.995712, 116.305886));
		lis80.add(new GeoPoint(39.997592, 116.286627));
		lis80.add(new GeoPoint(39.990737, 116.285477));
		lis80.add(new GeoPoint(39.979128, 116.29252));
		lis80.add(new GeoPoint(39.965083, 116.300712));
		lis80.add(new GeoPoint(39.972935, 116.327733));
		lis80.add(new GeoPoint(39.981118, 116.331758));
		lis80.add(new GeoPoint(39.982334, 116.360647));
		lis80.add(new GeoPoint(39.992119, 116.344549));
		lis80.add(new GeoPoint(40.015, 116.343328));
		lis80.add(new GeoPoint(40.023897, 116.33456));
		lis80.add(new GeoPoint(40.025775, 116.334776));
		hasMap.put("二区	中关村局", lis80);

		// 二区==大有庄局
		ArrayList<GeoPoint> lis81 = new ArrayList<GeoPoint>();
		lis81.add(new GeoPoint(40.035057, 116.069884));
		lis81.add(new GeoPoint(40.000079, 116.171967));
		lis81.add(new GeoPoint(39.979846, 116.196832));
		lis81.add(new GeoPoint(39.94661, 116.225578));
		lis81.add(new GeoPoint(39.94661, 116.244334));
		lis81.add(new GeoPoint(39.956566, 116.24764));
		lis81.add(new GeoPoint(39.953469, 116.253821));
		lis81.add(new GeoPoint(39.960327, 116.253821));
		lis81.add(new GeoPoint(39.978962, 116.245987));
		lis81.add(new GeoPoint(39.986536, 116.242466));
		lis81.add(new GeoPoint(39.996044, 116.263918));
		lis81.add(new GeoPoint(39.990737, 116.285477));
		lis81.add(new GeoPoint(39.997592, 116.286627));
		lis81.add(new GeoPoint(39.995712, 116.305886));
		lis81.add(new GeoPoint(40.003229, 116.301143));
		lis81.add(new GeoPoint(40.020692, 116.293669));
		lis81.add(new GeoPoint(40.023013, 116.309623));
		lis81.add(new GeoPoint(40.032184, 116.304593));
		lis81.add(new GeoPoint(40.055604, 116.279368));
		lis81.add(new GeoPoint(40.059801, 116.253066));
		lis81.add(new GeoPoint(40.051517, 116.247461));
		lis81.add(new GeoPoint(40.027985, 116.255509));
		lis81.add(new GeoPoint(40.022902, 116.249078));
		lis81.add(new GeoPoint(40.012182, 116.232585));
		lis81.add(new GeoPoint(40.032073, 116.220404));
		hasMap.put("二区	大有庄局", lis81);

		// 八区==紫竹院
		ArrayList<GeoPoint> lis82 = new ArrayList<GeoPoint>();
		lis82.add(new GeoPoint(39.965083, 116.300712));
		lis82.add(new GeoPoint(39.938589, 116.303191));
		lis82.add(new GeoPoint(39.925311, 116.302185));
		lis82.add(new GeoPoint(39.920787, 116.316522));
		lis82.add(new GeoPoint(39.930152, 116.316666));
		lis82.add(new GeoPoint(39.929239, 116.332297));
		lis82.add(new GeoPoint(39.949376, 116.331614));
		lis82.add(new GeoPoint(39.972935, 116.327733));
		hasMap.put("八区	紫竹院", lis82);

		// 八区==展览路
		ArrayList<GeoPoint> lis83 = new ArrayList<GeoPoint>();
		lis83.add(new GeoPoint(39.949376, 116.331614));
		lis83.add(new GeoPoint(39.929239, 116.332297));
		lis83.add(new GeoPoint(39.92953, 116.362803));
		lis83.add(new GeoPoint(39.948491, 116.360791));
		hasMap.put("八区	展览路", lis83);

		// 八区==茂林居
		ArrayList<GeoPoint> lis84 = new ArrayList<GeoPoint>();
		lis84.add(new GeoPoint(39.930152, 116.316666));
		lis84.add(new GeoPoint(39.920787, 116.316522));
		lis84.add(new GeoPoint(39.913607, 116.316666));
		lis84.add(new GeoPoint(39.912984, 116.350263));
		lis84.add(new GeoPoint(39.908557, 116.349257));
		lis84.add(new GeoPoint(39.90673, 116.354718));
		lis84.add(new GeoPoint(39.906965, 116.36309));
		lis84.add(new GeoPoint(39.913316, 116.362947));
		lis84.add(new GeoPoint(39.92953, 116.362803));
		lis84.add(new GeoPoint(39.929239, 116.332297));
		hasMap.put("八区	茂林居", lis84);

		// 八区==四季青
		ArrayList<GeoPoint> lis85 = new ArrayList<GeoPoint>();
		lis85.add(new GeoPoint(39.996044, 116.263918));
		lis85.add(new GeoPoint(39.986536, 116.242466));
		lis85.add(new GeoPoint(39.978962, 116.245987));
		lis85.add(new GeoPoint(39.960327, 116.253821));
		lis85.add(new GeoPoint(39.953469, 116.253821));
		lis85.add(new GeoPoint(39.956566, 116.24764));
		lis85.add(new GeoPoint(39.94661, 116.244334));
		lis85.add(new GeoPoint(39.939474, 116.275703));
		lis85.add(new GeoPoint(39.927413, 116.279117));
		lis85.add(new GeoPoint(39.925311, 116.302185));
		lis85.add(new GeoPoint(39.938589, 116.303191));
		lis85.add(new GeoPoint(39.965083, 116.300712));
		lis85.add(new GeoPoint(39.979128, 116.29252));
		lis85.add(new GeoPoint(39.990737, 116.285477));
		hasMap.put("八区	四季青", lis85);

		// 八区==五棵松
		ArrayList<GeoPoint> lis86 = new ArrayList<GeoPoint>();
		lis86.add(new GeoPoint(39.94661, 116.244334));
		lis86.add(new GeoPoint(39.946596, 116.241568));
		lis86.add(new GeoPoint(39.937939, 116.240238));
		lis86.add(new GeoPoint(39.937538, 116.226548));
		lis86.add(new GeoPoint(39.930443, 116.224536));
		lis86.add(new GeoPoint(39.93083, 116.24128));
		lis86.add(new GeoPoint(39.913178, 116.238621));
		lis86.add(new GeoPoint(39.913565, 116.259318));
		lis86.add(new GeoPoint(39.887245, 116.259139));
		lis86.add(new GeoPoint(39.887328, 116.282494));
		lis86.add(new GeoPoint(39.900227, 116.314402));
		lis86.add(new GeoPoint(39.913773, 116.308545));
		lis86.add(new GeoPoint(39.913607, 116.316666));
		lis86.add(new GeoPoint(39.920787, 116.316522));
		lis86.add(new GeoPoint(39.925311, 116.302185));
		lis86.add(new GeoPoint(39.927413, 116.279117));
		lis86.add(new GeoPoint(39.939474, 116.275703));
		hasMap.put("八区	五棵松", lis86);

		// 八区==鲁谷
		ArrayList<GeoPoint> lis87 = new ArrayList<GeoPoint>();
		lis87.add(new GeoPoint(39.913206, 116.211474));
		lis87.add(new GeoPoint(39.888906, 116.209983));
		lis87.add(new GeoPoint(39.877057, 116.231974));
		lis87.add(new GeoPoint(39.883619, 116.257989));
		lis87.add(new GeoPoint(39.887245, 116.259139));
		lis87.add(new GeoPoint(39.913565, 116.259318));
		lis87.add(new GeoPoint(39.913178, 116.238621));
		hasMap.put("八区	鲁谷", lis87);

		// 八区==石景山
		ArrayList<GeoPoint> lis88 = new ArrayList<GeoPoint>();
		lis88.add(new GeoPoint(39.991829, 116.119003));
		lis88.add(new GeoPoint(39.948366, 116.127339));
		lis88.add(new GeoPoint(39.934315, 116.136394));
		lis88.add(new GeoPoint(39.911739, 116.157091));
		lis88.add(new GeoPoint(39.896241, 116.17362));
		lis88.add(new GeoPoint(39.890373, 116.182387));
		lis88.add(new GeoPoint(39.882401, 116.212139));
		lis88.add(new GeoPoint(39.888906, 116.209983));
		lis88.add(new GeoPoint(39.913206, 116.211474));
		lis88.add(new GeoPoint(39.913178, 116.238621));
		lis88.add(new GeoPoint(39.93083, 116.24128));
		lis88.add(new GeoPoint(39.930443, 116.224536));
		lis88.add(new GeoPoint(39.937538, 116.226548));
		lis88.add(new GeoPoint(39.937939, 116.240238));
		lis88.add(new GeoPoint(39.946596, 116.241568));
		lis88.add(new GeoPoint(39.94661, 116.225578));
		lis88.add(new GeoPoint(39.979846, 116.196832));
		lis88.add(new GeoPoint(40.000079, 116.171967));
		hasMap.put("八区	石景山", lis88);

		// 三区==卢沟桥分局

		ArrayList<GeoPoint> lis89 = new ArrayList<GeoPoint>();
		lis89.add(new GeoPoint(39.881778, 116.209085));
		lis89.add(new GeoPoint(39.869762, 116.219505));
		lis89.add(new GeoPoint(39.859018, 116.224608));
		lis89.add(new GeoPoint(39.850931, 116.226764));
		lis89.add(new GeoPoint(39.845502, 116.223458));
		lis89.add(new GeoPoint(39.82744, 116.219433));
		lis89.add(new GeoPoint(39.828992, 116.235819));
		lis89.add(new GeoPoint(39.818906, 116.247317));
		lis89.add(new GeoPoint(39.818463, 116.269739));
		lis89.add(new GeoPoint(39.856858, 116.24128));
		lis89.add(new GeoPoint(39.861953, 116.245305));
		lis89.add(new GeoPoint(39.875687, 116.271607));
		lis89.add(new GeoPoint(39.887107, 116.270637));
		lis89.add(new GeoPoint(39.887245, 116.259139));
		lis89.add(new GeoPoint(39.883619, 116.257989));
		lis89.add(new GeoPoint(39.877057, 116.231974));
		lis89.add(new GeoPoint(39.882401, 116.212139));
		hasMap.put("三区	卢沟桥分局", lis89);

		// 三区==丰台局
		ArrayList<GeoPoint> lis90 = new ArrayList<GeoPoint>();
		lis90.add(new GeoPoint(39.861953, 116.245305));
		lis90.add(new GeoPoint(39.854199, 116.273188));
		lis90.add(new GeoPoint(39.852537, 116.289861));
		lis90.add(new GeoPoint(39.855528, 116.332836));
		lis90.add(new GeoPoint(39.859738, 116.327374));
		lis90.add(new GeoPoint(39.873694, 116.319325));
		lis90.add(new GeoPoint(39.887536, 116.309551));
		lis90.add(new GeoPoint(39.89595, 116.309264));
		lis90.add(new GeoPoint(39.887328, 116.282494));
		lis90.add(new GeoPoint(39.887107, 116.270637));
		lis90.add(new GeoPoint(39.875687, 116.271607));
		hasMap.put("三区	丰台局", lis90);

		// 三区==丰台南局
		ArrayList<GeoPoint> lis91 = new ArrayList<GeoPoint>();
		lis91.add(new GeoPoint(39.861953, 116.245305));
		lis91.add(new GeoPoint(39.856858, 116.24128));
		lis91.add(new GeoPoint(39.818463, 116.269739));
		lis91.add(new GeoPoint(39.818906, 116.247317));
		lis91.add(new GeoPoint(39.802757, 116.258797));
		lis91.add(new GeoPoint(39.805667, 116.291352));
		lis91.add(new GeoPoint(39.808708, 116.30833));
		lis91.add(new GeoPoint(39.83697, 116.319541));
		lis91.add(new GeoPoint(39.836749, 116.352598));
		lis91.add(new GeoPoint(39.855418, 116.352311));
		lis91.add(new GeoPoint(39.855528, 116.334057));
		lis91.add(new GeoPoint(39.859738, 116.327374));
		lis91.add(new GeoPoint(39.858852, 116.310486));
		lis91.add(new GeoPoint(39.852537, 116.289861));
		lis91.add(new GeoPoint(39.854199, 116.273188));
		hasMap.put("三区	丰台南局", lis91);

		// 三区==西客站
		ArrayList<GeoPoint> lis92 = new ArrayList<GeoPoint>();
		lis92.add(new GeoPoint(39.913773, 116.308545));
		lis92.add(new GeoPoint(39.900227, 116.314402));
		lis92.add(new GeoPoint(39.902316, 116.315732));
		lis92.add(new GeoPoint(39.902538, 116.340309));
		lis92.add(new GeoPoint(39.913385, 116.342322));
		lis92.add(new GeoPoint(39.913607, 116.316666));
		hasMap.put("三区	西客站", lis92);

		// 三区==广外局
		ArrayList<GeoPoint> lis93 = new ArrayList<GeoPoint>();
		lis93.add(new GeoPoint(39.913385, 116.342322));
		lis93.add(new GeoPoint(39.902538, 116.340309));
		lis93.add(new GeoPoint(39.902316, 116.315732));
		lis93.add(new GeoPoint(39.89595, 116.309264));
		lis93.add(new GeoPoint(39.887536, 116.309551));
		lis93.add(new GeoPoint(39.890747, 116.317313));
		lis93.add(new GeoPoint(39.873694, 116.319325));
		lis93.add(new GeoPoint(39.859738, 116.327374));
		lis93.add(new GeoPoint(39.855528, 116.334057));
		lis93.add(new GeoPoint(39.855418, 116.352311));
		lis93.add(new GeoPoint(39.867602, 116.35806));
		lis93.add(new GeoPoint(39.895563, 116.35497));
		lis93.add(new GeoPoint(39.90673, 116.354718));
		lis93.add(new GeoPoint(39.908557, 116.349257));
		lis93.add(new GeoPoint(39.912984, 116.350263));
		hasMap.put("三区	广外局", lis93);

		// 三区==樱桃园
		ArrayList<GeoPoint> lis94 = new ArrayList<GeoPoint>();
		lis94.add(new GeoPoint(39.855418, 116.352311));
		lis94.add(new GeoPoint(39.863234, 116.377697));
		lis94.add(new GeoPoint(39.876358, 116.380931));
		lis94.add(new GeoPoint(39.890138, 116.39277));
		lis94.add(new GeoPoint(39.895923, 116.390758));
		lis94.add(new GeoPoint(39.895563, 116.35497));
		lis94.add(new GeoPoint(39.867602, 116.35806));
		hasMap.put("三区	樱桃园", lis94);

		// 三区==厂甸局
		ArrayList<GeoPoint> lis95 = new ArrayList<GeoPoint>();
		lis95.add(new GeoPoint(39.90673, 116.354718));
		lis95.add(new GeoPoint(39.895563, 116.35497));
		lis95.add(new GeoPoint(39.895923, 116.390758));
		lis95.add(new GeoPoint(39.890138, 116.39277));
		lis95.add(new GeoPoint(39.878352, 116.394298));
		lis95.add(new GeoPoint(39.879466, 116.427589));
		lis95.add(new GeoPoint(39.892864, 116.40488));
		lis95.add(new GeoPoint(39.906979, 116.406101));
		lis95.add(new GeoPoint(39.906965, 116.36309));
		hasMap.put("三区	厂甸局", lis95);

		// 三区==长辛店
		ArrayList<GeoPoint> lis96 = new ArrayList<GeoPoint>();
		lis96.add(new GeoPoint(39.896241, 116.17362));
		lis96.add(new GeoPoint(39.896006, 116.157558));
		lis96.add(new GeoPoint(39.859018, 116.008655));
		lis96.add(new GeoPoint(39.857024, 116.041138));
		lis96.add(new GeoPoint(39.841735, 116.076926));
		lis96.add(new GeoPoint(39.836195, 116.092305));
		lis96.add(new GeoPoint(39.81148, 116.089718));
		lis96.add(new GeoPoint(39.79607, 116.099779));
		lis96.add(new GeoPoint(39.795072, 116.123782));
		lis96.add(new GeoPoint(39.767791, 116.11832));
		lis96.add(new GeoPoint(39.747489, 116.1268));
		lis96.add(new GeoPoint(39.78146, 116.170134));
		lis96.add(new GeoPoint(39.791441, 116.192269));
		lis96.add(new GeoPoint(39.785342, 116.208366));
		lis96.add(new GeoPoint(39.820347, 116.214978));
		lis96.add(new GeoPoint(39.82744, 116.219433));
		lis96.add(new GeoPoint(39.845502, 116.223458));
		lis96.add(new GeoPoint(39.859018, 116.224608));
		lis96.add(new GeoPoint(39.869762, 116.219505));
		lis96.add(new GeoPoint(39.881778, 116.209085));
		lis96.add(new GeoPoint(39.890373, 116.182387));
		hasMap.put("三区	长辛店", lis96);

		// 房山==良乡分局
		ArrayList<GeoPoint> lis97 = new ArrayList<GeoPoint>();
		lis97.add(new GeoPoint(39.82744, 116.219433));
		lis97.add(new GeoPoint(39.820347, 116.214978));
		lis97.add(new GeoPoint(39.785342, 116.208366));
		lis97.add(new GeoPoint(39.791441, 116.192269));
		lis97.add(new GeoPoint(39.78146, 116.170134));
		lis97.add(new GeoPoint(39.778327, 116.176962));
		lis97.add(new GeoPoint(39.769898, 116.180267));
		lis97.add(new GeoPoint(39.774501, 116.208797));
		lis97.add(new GeoPoint(39.758396, 116.259049));
		lis97.add(new GeoPoint(39.775589, 116.259911));
		lis97.add(new GeoPoint(39.802757, 116.258797));
		lis97.add(new GeoPoint(39.818906, 116.247317));
		lis97.add(new GeoPoint(39.828992, 116.235819));
		hasMap.put("房山	良乡分局", lis97);

		// 门头沟==石龙分局
		ArrayList<GeoPoint> lis98 = new ArrayList<GeoPoint>();
		lis98.add(new GeoPoint(39.934315, 116.136394));
		lis98.add(new GeoPoint(39.919427, 116.087159));
		lis98.add(new GeoPoint(39.914004, 116.059132));
		lis98.add(new GeoPoint(39.907667, 116.057982));
		lis98.add(new GeoPoint(39.900942, 116.043753));
		lis98.add(new GeoPoint(39.859018, 116.008655));
		lis98.add(new GeoPoint(39.884639, 116.126756));
		lis98.add(new GeoPoint(39.896006, 116.157558));
		lis98.add(new GeoPoint(39.896241, 116.17362));
		lis98.add(new GeoPoint(39.911739, 116.157091));
		hasMap.put("门头沟	石龙分局", lis98);

		// 门头沟==门城分局
		ArrayList<GeoPoint> lis99 = new ArrayList<GeoPoint>();
		lis99.add(new GeoPoint(39.991829, 116.119003));
		lis99.add(new GeoPoint(39.987098, 116.095208));
		lis99.add(new GeoPoint(39.976373, 116.079685));
		lis99.add(new GeoPoint(39.971065, 116.046771));
		lis99.add(new GeoPoint(39.963876, 116.0209));
		lis99.add(new GeoPoint(39.935445, 115.999484));
		lis99.add(new GeoPoint(39.914004, 116.059132));
		lis99.add(new GeoPoint(39.919427, 116.087159));
		lis99.add(new GeoPoint(39.934315, 116.136394));
		lis99.add(new GeoPoint(39.948366, 116.127339));
		hasMap.put("门头沟	门城分局", lis99);

		// 门头沟==军庄分局
		ArrayList<GeoPoint> lis100 = new ArrayList<GeoPoint>();
		lis100.add(new GeoPoint(40.035057, 116.069884));
		lis100.add(new GeoPoint(40.036603, 116.10869));
		lis100.add(new GeoPoint(40.034007, 116.092952));
		lis100.add(new GeoPoint(40.050136, 116.075561));
		lis100.add(new GeoPoint(40.153183, 115.890969));
		lis100.add(new GeoPoint(40.0777, 115.853024));
		lis100.add(new GeoPoint(39.971065, 116.046771));
		lis100.add(new GeoPoint(39.976373, 116.079685));
		lis100.add(new GeoPoint(39.987098, 116.095208));
		lis100.add(new GeoPoint(39.991829, 116.119003));
		lis100.add(new GeoPoint(40.000079, 116.171967));
		hasMap.put("门头沟	军庄分局", lis100);

		ArrayList<GeoPoint> lis101 = new ArrayList<GeoPoint>();
		lis101.add(new GeoPoint(39.836749, 116.352598));
		lis101.add(new GeoPoint(39.83697, 116.319541));
		lis101.add(new GeoPoint(39.808708, 116.30833));
		lis101.add(new GeoPoint(39.805667, 116.291352));
		lis101.add(new GeoPoint(39.775035, 116.31672));
		lis101.add(new GeoPoint(39.8032, 116.334183));
		lis101.add(new GeoPoint(39.8032, 116.334183));
		lis101.add(new GeoPoint(39.80769, 116.346903));
		lis101.add(new GeoPoint(39.813953, 116.351969));
		lis101.add(new GeoPoint(39.823069, 116.351538));
		hasMap.put("三区	新发地", lis101);
		return hasMap;

	}

}
