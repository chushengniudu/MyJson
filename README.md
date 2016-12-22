# MyJson
Android开发：JSON简介及最全面解析方法(Gson、AS自带org.json、Jackson解析)
# 参考自：http://www.jianshu.com/p/b87fee2f7a23
 * 因为Android Studio自带org.json 比较消耗时间和内存,解析速度和效率慢 比Gson和Jackson解析都差 这里不予解析
 * <p>
 * Gson解析：GSON可按需解析，即创建的JavaBean类不一定完全涵盖所要解析的JSON数据，按需创建属性
 * Jackson解析：Jackson解析对应的JavaBean必须把Json数据里面的所有key都有所对应，即必须把JSON内的数据所有解析出来，无法按需解析。但Jackson的解析速度和效率都要比GSON高
 * <p>
 * 在这里你可以尝试将VRConfig对象去除（private List<RootEntity> root;） 会发现Gson解析是成功的，但是Jackson解析是失败的，项目用哪一种按照项目需求来。
