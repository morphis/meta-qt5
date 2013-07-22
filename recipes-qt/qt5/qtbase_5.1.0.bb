require qt5-${PV}.inc
require ${PN}.inc

SRC_URI += " \
    file://0019-Fix-FBO-restoring-in-QOpenGLTextureGlyphCache.patch \
    file://0001-Use-OE_QMAKE_PATH_EXTERNAL_HOST_BINS-to-determine-pa.patch \
"

SRC_URI[md5sum] = "0f8d14bb4039a2996c501a376ca7dae0"
SRC_URI[sha256sum] = "1fa8c591adab9d45e4f322edea9a55a517ebf1a006dd481eace0236623adc90a"
